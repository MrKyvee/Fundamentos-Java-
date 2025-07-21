package LacosDeRepeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int x, i;
        //Entrada
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();

        //Processamento + Saída
        i = 0;
        while (i < 6 ){
            if (x % 2 != 0){
                System.out.println(x);
                x ++;
                i ++;
            }
            else {
                x ++;
            }
        }
    }
}
