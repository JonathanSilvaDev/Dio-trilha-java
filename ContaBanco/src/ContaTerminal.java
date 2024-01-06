import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scan.nextLine();

        System.out.println("Por favar, digite o número da sua conta");
        int numeroConta = scan.nextInt();

        System.out.println("Digite seu saldo");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + "R$" + saldo + " já está disponível para saque.");

        scan.close();
    }
}