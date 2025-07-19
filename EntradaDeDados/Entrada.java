package EntradaDeDados;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Valor da variavel a: " + a);
        sc.close();
    }
}
