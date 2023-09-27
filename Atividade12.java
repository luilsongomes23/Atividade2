import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioBruto, gratificacao, imposto, valorAReceber;

        imposto = 0.07;

        System.out.print("Informe o salário: R$ ");
        salarioBruto = entrada.nextDouble();

        if (salarioBruto <= 350) {
            gratificacao = 100.00;
        } else if (salarioBruto <= 600) {
            gratificacao = 75.00;
        } else if (salarioBruto <= 900) {
            gratificacao = 50.00;
        } else {
            gratificacao = 35.00;
        }

        valorAReceber = salarioBruto + gratificacao - (salarioBruto * imposto);

        System.out.println("Valor a receber: R$" + valorAReceber);
        entrada.close();
    }
}
