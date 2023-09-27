import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double taxaPoupanca, taxaRendaFixa, valorCorrigido, valorInvestido;

        System.out.print("Digite o tipo de investimento (1 para Poupança, 2 para Fundos de renda fixa): ");
        int tipoInvestimento = entrada.nextInt();


        System.out.print("Digite o valor do investimento: ");
        valorInvestido = entrada.nextDouble();


         taxaPoupanca = 0.03;
         taxaRendaFixa = 0.04;
         valorCorrigido = 0.0;
        String tipoDescricao = "";


        switch (tipoInvestimento) {
            case 1:
                valorCorrigido = valorInvestido + (valorInvestido * taxaPoupanca);
                tipoDescricao = "Poupança";
                break;
            case 2:
                valorCorrigido = valorInvestido + (valorInvestido * taxaRendaFixa);
                tipoDescricao = "Fundos de renda fixa";
                break;
            default:
                System.out.println("Tipo de investimento inválido");
                System.exit(0);
        }


        System.out.println("Após um mês de investimento em " + tipoDescricao + ": R$" + valorCorrigido);

        entrada.close();
    }
}
