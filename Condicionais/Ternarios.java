package Condicionais;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        // Ternário:
        // É uma forma abreviada de escrever um if-else que retorna um valor
        // ao invés de executar um bloco de código.
        // Sintaxe: SeCondiçãoForVerdadeira ? valor : valor
        //? Então retorna : Senão retorna
        String parOuImpar = (numero % 2 == 0) ? "é par" : "é ímpar";

        System.out.println(parOuImpar);
        sc.close();
    }
}
