package src;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informer o Saldo Atual : $");
        double saldoAtual = scan.nextDouble();
        System.out.print("Informer o Valor Depositado : $");
        double valorDeposito = scan.nextDouble();
        System.out.print("Informer o Valor Retirado : $");
        double valorRetirada = scan.nextDouble();
        scan.close();

        contar(saldoAtual, valorDeposito, valorRetirada);
    }


    public static void contar(double saldoAtual, double valorDeposito, double valorRetirada) {
        double valor = saldoAtual + valorDeposito - valorRetirada;
        System.out.println(String.format("Saldo atualizado na conta: %.1f", valor));
    }
}