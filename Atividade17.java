import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senhaCorreta = "4531";
        String senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = entrada.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido. Bem-vindo!");
        } else {
            System.out.println("Senha incorreta. Acesso negado.");
        }

        entrada.close();
    }
}
