import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.print("Informe um número : ");
        n1 = entrada.nextDouble();
        System.out.print("Informe um número: ");
        n2 = entrada.nextDouble();

        if (n1 > n2){
            System.out.println(n2 + " menor que " + n1);
        } else if (n1 < n2) {
            System.out.println(n1 + " menor que " + n2);
        } else {
            System.out.println("São iguais! ");
        }
        entrada.close();

    }
}
