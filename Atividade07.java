import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.print("Seu salário: ");
        salario = entrada.nextDouble();

        if (salario < 500) {
            double salrejus = salario * 1.3;
            System.out.println("Seu salário reajustado é: " + salrejus);
        } else {
            System.out.println("Você não está apto a receber o reajuste.");
        }

        entrada.close();
    }
}
