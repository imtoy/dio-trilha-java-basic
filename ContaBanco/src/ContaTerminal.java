import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner contaBancaria = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        String nomeCliente = contaBancaria.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = contaBancaria.nextLine();

        System.out.println("Informe o número da conta: ");
        int numero = contaBancaria.nextInt();

        System.out.println("Digite o valor que deseja depositar: ");
        double saldo = contaBancaria.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é, " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}