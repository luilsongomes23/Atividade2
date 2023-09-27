import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, n4, media;

        System.out.print("Informe a primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota: ");
        n2 = entrada.nextDouble();
        System.out.print("Informe a terceira nota: ");
        n3 = entrada.nextDouble();
        System.out.print("Informe a quarta nota: ");
        n4 = entrada.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado, sua média é: " + media);
        } else {
            System.out.println("Reprovado, sua nota é: " + media);
        }

        entrada.close();
    }
}
