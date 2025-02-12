import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // criando um Scanner para capturar entrada do usuário
        try (Scanner scanner = new Scanner(System.in)) {

            // entrada
            System.out.println("Por favor, Digite o número da conta: ");
            numero = scanner.nextInt();
            System.out.println("Por favor, Digite o número agência: ");
            agencia = scanner.next();
            System.out.println("Por favor, Digite o seu nome: ");
            scanner.nextLine();
            nomeCliente = scanner.nextLine();
            System.out.println("Por favor, Digite o saldo da conta: ");
            saldo = scanner.nextDouble();

            // saída
            System.out.println(
                    "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                            + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        }
    }
}
