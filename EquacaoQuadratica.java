import java.util.Scanner;

public class EquacaoQuadratica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 1;
        double b = -5;
        double c = 6;

        double delta = b * b - 4 * a * c;

        if (delta >= 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As soluções da equação são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {

            System.out.println("A equação não tem soluções reais.");
        }

        scanner.close();
    }
}