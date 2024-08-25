import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();

        double gratificacao = salarioBruto * 0.10;

        double salarioAposGratificacao = salarioBruto + gratificacao;

        double desconto = salarioAposGratificacao * 0.15;

        double salarioLiquido = salarioAposGratificacao - desconto;

        System.out.println("O salário líquido do funcionário é: " + salarioLiquido);

        scanner.close();
    }
}