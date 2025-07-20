package Condicionais;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        //Ternario
        String parOuImpar = (numero % 2 == 0) ? "é par": "é Impar";
        System.out.println(parOuImpar);
        sc.close();
    }
}
