import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double preço, novopreço;

        System.out.print("Preço do produto: R$");
        preço = entrada.nextDouble();

        if (preço <= 50) {
            novopreço = preço + (preço * 0.05);
        } else if (preço <= 100) {
            novopreço = preço + (preço * 0.1);
        } else {
            novopreço = preço + (preço * 0.15);
        }

        System.out.println("Novo preço é: R$" + novopreço);

        if (novopreço <= 80) {
            System.out.println("Barato");
        } else if (novopreço <= 120) {
            System.out.println("Normal");
        } else if (novopreço <= 200) {
            System.out.println("Caro");
        } else {
            System.out.println("Muito caro");
        }

        entrada.close();
    }
}
