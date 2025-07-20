package Condicionais;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        double preco = 0;
        int quantidade, escolha;
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Cachorro Quente R$4.00");
        System.out.println("[2] X-Salada R$4.50");
        System.out.println("[3] X-Bacon R$5.00");
        System.out.println("[4] X-Tudo R$5.50");
        System.out.print("Digite algum dos códigos acima: ");
        escolha = sc.nextInt();

        if (escolha > 0 && escolha <= 4) {
            switch (escolha) {
                case 1:
                    System.out.print("Quantos Cachorro Quente quer? ");
                    quantidade = sc.nextInt();
                    preco = 4.00;
                    if (quantidade > 0 && quantidade <= 10) {
                        System.out.println("Valor total ficou: R$ " + (quantidade * preco));
                    } else {
                        System.out.println("Quantidade não aceita");
                    }
                    break;

                case 2:
                    System.out.print("Quantos X-Salada quer? ");
                    quantidade = sc.nextInt();
                    preco = 4.50;
                    if (quantidade > 0 && quantidade <= 10) {
                        System.out.println("Valor total ficou: R$ " + (quantidade * preco));
                    } else {
                        System.out.println("Quantidade não aceita");
                    }
                    break;

                case 3:
                    System.out.print("Quantos X-Bacon quer? ");
                    quantidade = sc.nextInt();
                    preco = 5.00;
                    if (quantidade > 0 && quantidade <= 10) {
                        System.out.println("Valor total ficou: R$ " + (quantidade * preco));
                    } else {
                        System.out.println("Quantidade não aceita");
                    }
                    break;

                case 4:
                    System.out.print("Quantos X-Tudo quer? ");
                    quantidade = sc.nextInt();
                    preco = 5.50;
                    if (quantidade > 0 && quantidade <= 10) {
                        System.out.println("Valor total ficou: R$ " + (quantidade * preco));
                    } else {
                        System.out.println("Quantidade não aceita");
                    }
                    break;
            }
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
