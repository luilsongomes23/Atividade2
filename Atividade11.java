import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioAtual, aumento, novoSalario;

        System.out.print("Salário atual:R$ ");
        salarioAtual = entrada.nextDouble();

        if (salarioAtual <= 300) {
            aumento = salarioAtual * 0.15;
        } else if (salarioAtual <= 600) {
            aumento = salarioAtual * 0.10;
        } else if (salarioAtual <= 900) {
            aumento = salarioAtual * 0.05;
        } else {
            aumento = 0;
        }

        novoSalario = salarioAtual + aumento;

        System.out.println("Aumento: R$"+ aumento);
        System.out.println("Novo salário: R$"+ novoSalario);

        entrada.close();
    }
}
