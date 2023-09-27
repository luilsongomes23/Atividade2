import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.print("Seu salário: ");
        salario = entrada.nextDouble();

        double pcault;
        if (salario <= 300) {
             pcault = 0.35;
        }
        else {
           pcault =  0.15;
        }

        double aumento = (salario * pcault) / 100.0;
        double salrejus = salario + aumento;


        System.out.println("O percentual de aumento aplicado é: " + pcault + "%");
        System.out.println("O salário reajustado é: " + salrejus);

        entrada.close();
    }
}
