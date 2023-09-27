import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigoProduto, quantidadeProduto;
        double precoUnitario, precoTotal, desconto, precoFinal;

        System.out.print("Informe o código do produto (de 1 a 40): ");
        codigoProduto = entrada.nextInt();
        System.out.print("Informe a quantidade de produtos comprados: ");
        quantidadeProduto = entrada.nextInt();

        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUnitario = 10.00;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUnitario = 15.00;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUnitario = 20.00;
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Código de produto inválido.");
            return; // Encerra o programa se o código for inválido
        }

        precoTotal = precoUnitario * quantidadeProduto;

        if (precoTotal <= 250.00) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal > 250.00 && precoTotal <= 500.00) {
            desconto = precoTotal * 0.10;
        } else {
            desconto = precoTotal * 0.15;
        }

        precoFinal = precoTotal - desconto;

        System.out.println("Preço unitário do produto: R$" + precoUnitario);
        System.out.println("Preço total da nota: R$" + precoTotal);
        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Preço final da nota após o desconto: R$" + precoFinal);

        entrada.close();
    }
}
