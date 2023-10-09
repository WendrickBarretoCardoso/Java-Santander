package src;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        askUser();
    }

    public static void askUser() {
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nome;
        double saldo;
        System.out.println("Crie sua Conta!");
        System.out.println("Qual seu nome: ");
        nome = scan.nextLine();
        System.out.println("Informe a agência em que você está criando sua conta: ");
        agencia = scan.nextLine();
        System.out.println("Informe o número da sua conta: ");
        numero = scan.nextInt();
        System.out.println("Informe o quanto você depositar: ");
        saldo = scan.nextDouble();
        scan.close();
        conta(numero, agencia, nome, saldo);
    }

    public static void conta(int numero, String agencia, String nome, double saldo) {
        String conta = String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
        "sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque!",
        nome, agencia, numero, saldo);
        System.out.println(conta);
    }
}