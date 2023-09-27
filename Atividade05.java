import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                double media = (num1 + num2) / 2;
                System.out.println("Média: " + media);
                break;
            case 2:
                double diferenca = Math.abs(num1 - num2);
                System.out.println("Diferença: " + diferenca);
                break;
            case 3:
                double produto = num1 * num2;
                System.out.println("Produto: " + produto);
                break;
            case 4:
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("Divisão: " + divisao);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
        entrada.close();

    }
}
