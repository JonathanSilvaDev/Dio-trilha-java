import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite seu nome: ");
        conta.titular = scan.nextLine();

        System.out.println("Digite sua agência");
        conta.agencia = scan.nextInt();

        System.out.println("Digite o número da sua conta");
        conta.numeroCorrente = scan.nextInt();

        System.out.println("Adicione seu saldo");
        conta.saldo = scan.nextDouble();


        System.out.println("Olá, " + conta.titular + ", sua agência é " + conta.agencia + ", sua conta corrente é " + conta.numeroCorrente + " e seu saldo é: R$"+ conta.saldo);


    }
}