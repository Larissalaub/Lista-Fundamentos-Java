import java.util.Scanner;

public class ConversaoMedidas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em pés: ");
        double medidaEmPes = scanner.nextDouble();

        double medidaEmPolegadas = medidaEmPes * 12;

        double medidaEmJardas = medidaEmPes / 3;

        double medidaEmMilhas = medidaEmJardas / 1760;

        System.out.println("A medida em polegadas é: " + medidaEmPolegadas + " polegadas");
        System.out.println("A medida em jardas é: " + medidaEmJardas + " jardas");
        System.out.println("A medida em milhas é: " + medidaEmMilhas + " milhas");

        scanner.close();
    }
}