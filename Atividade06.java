import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Elevação dos números: ");
        System.out.println("2 - Raiz quadrada dos números: ");
        System.out.println("3 - Raiz cúbica dos números: ");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                double res = Math.pow(n1, n2);
                System.out.println("Números elevados: " + res);
                break;
            case 2:
                double r1 = Math.sqrt(n1);
                double r2 = Math.sqrt(n2);
                System.out.println("Primeira raiz: " + r1);
                System.out.println("Segunda raiz: " + r2);
                break;
            case 3:
                r1 = Math.cbrt(n1);
                r2 = Math.cbrt(n2);
                System.out.println("Primeira raiz: " + r1);
                System.out.println("Segunda raiz: " + r2);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        entrada.close();

    }
}
