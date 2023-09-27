import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double credito, saldomid;

        System.out.println("Saldo R$: ");
        saldomid = entrada.nextDouble();

        if (saldomid > 400) {
            credito = saldomid * 0.3;
        } else if (saldomid > 300) {
            credito = saldomid * 0.25;
        } else if (saldomid > 200) {
            credito = saldomid * 0.2;
        } else {
            credito = saldomid * 0.1;
        }

        System.out.println("Saldo R$: " + saldomid);
        System.out.println("Crédito R$: " + credito);

        entrada.close();
    }
}
