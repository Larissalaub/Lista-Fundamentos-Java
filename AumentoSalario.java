import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        double aumento = salarioAtual * 0.25;

        double novoSalario = salarioAtual + aumento;

        System.out.println("Nome: " + nome);
        System.out.println("Aumento: " + aumento);
        System.out.println("Novo salário: " + novoSalario);

        scanner.close();
    }
}