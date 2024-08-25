import java.util.Scanner;

public class RacaoGatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do saco de ração em kg: ");
        double pesoSaco = scanner.nextDouble();

        System.out.print("Digite a quantidade de ração fornecida para cada gato em gramas: ");
        double racaoPorGatoGramas = scanner.nextDouble();

        double racaoPorGatoQuilos = racaoPorGatoGramas / 1000;

        double racaoTotalPorDia = racaoPorGatoQuilos * 2;

        double racaoRestante = pesoSaco - (racaoTotalPorDia * 5);

        System.out.println("A quantidade de ração restante após cinco dias é: " + racaoRestante + " kg");

        scanner.close();
    }
}
