package EntradaDeDados;

// Para utilizarmos entrada de dados em Java, primeiro precisamos importar a classe Scanner do pacote java.util
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // Instanciando(gerando,criando) um objeto Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Lendo uma palavra (String) do usuário e retornando o valor
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        // Lendo um número inteiro do usuário e retornando o valor
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        // Fechando o Scanner para liberar o recurso do System.in
        sc.close();

        System.out.printf("Nome digitado: %s%n", nome);
        System.out.printf("Idade digitada: %d%n ", idade);
    }
}
