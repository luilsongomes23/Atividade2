import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cusfab, carro;

        System.out.print("Custo para fabricar: R$");
        cusfab = entrada.nextDouble();

        if (cusfab <= 1200000) {
            carro = cusfab + (cusfab * 0.05);
        } else if (cusfab <= 2500000) {
            carro = cusfab + (cusfab * 0.1) + (cusfab * 0.15);
        } else {
            carro = cusfab + (cusfab * 0.15) + (cusfab * 0.20);
        }

        System.out.println("Carro custa: R$" + carro);

        entrada.close();
    }
}
