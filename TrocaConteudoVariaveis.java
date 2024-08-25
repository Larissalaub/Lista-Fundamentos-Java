import java.util.Scanner;

public class TrocaConteudoVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor literal: ");
        String valor1 = scanner.nextLine();

        System.out.print("Digite o segundo valor literal: ");
        String valor2 = scanner.nextLine();

        System.out.println("Valores originais:");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        String temp = valor1;
        valor1 = valor2;
        valor2 = temp;

        System.out.println("\nApós a troca:");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        scanner.close();
    }
}
