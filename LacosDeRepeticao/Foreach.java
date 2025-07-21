package LacosDeRepeticao;

import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = sc.nextInt();
        }
        sc.close();

        for (int i : vetor){
            System.out.println(i * 2);
        }
    }
}
