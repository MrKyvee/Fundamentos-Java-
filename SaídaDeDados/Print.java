package SaídaDeDados;

public class Print {
    public static void main(String[] args) {
        System.out.println("Hello World"); // Print com quebra de linha
        System.out.print("Ola Mundo");     // Print sem quebra de linha

        // Concatenando Valores
        System.out.println("Carro: " + 2024);

        // Concatenando Valores com Formatação
        System.out.printf("Modelo: %d%n", 2022);
        // % → Marcador, d → Tipo do marcador
        // %d → marcador para número inteiro
        // 2022 é passado para o marcador de tipo inteiro
        // %n → quebra de linha

        // Concatenando com formatação (controlando casas decimais)
        System.out.printf("Preço: %.2f", 85500.788f);
        // %.2f → Marcador de numero decimal com 2 casas após o ponto
        // .2   → define que queremos apenas 2 casas decimais
        // f    → indica que é um número decimal (float/double)
    }
}
