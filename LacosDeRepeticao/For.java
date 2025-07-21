package LacosDeRepeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //Entrada
        int x = new Scanner(System.in).nextInt();
        //Processamento
        if (x % 2 == 0) {x++;}
        for (int i = 0; i < 6 ; i++) {
            System.out.println(x);
            x += 2;
        }
    }
}
