import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

        scanner.close();
    }
}
