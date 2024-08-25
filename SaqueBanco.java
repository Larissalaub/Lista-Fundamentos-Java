import java.util.Scanner;

public class SaqueBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque (múltiplo de 5): ");
        int valorSaque = scanner.nextInt();

        int notas100 = valorSaque / 100;
        valorSaque = valorSaque % 100;

        int notas50 = valorSaque / 50;
        valorSaque = valorSaque % 50;

        int notas20 = valorSaque / 20;
        valorSaque = valorSaque % 20;

        int notas10 = valorSaque / 10;
        valorSaque = valorSaque % 10;

        int notas5 = valorSaque / 5;

        System.out.println("Quantidade de notas:");
        System.out.println("Notas de 100 reais: " + notas100);
        System.out.println("Notas de 50 reais: " + notas50);
        System.out.println("Notas de 20 reais: " + notas20);
        System.out.println("Notas de 10 reais: " + notas10);
        System.out.println("Notas de 5 reais: " + notas5);

        scanner.close();
    }
}