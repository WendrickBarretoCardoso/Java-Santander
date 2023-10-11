package src;

import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int saldoTotal = scan.nextInt();
        int valorSaque = scan.nextInt();
        scan.close();
        if (valorSaque > saldoTotal) {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        } else {
            System.out.println(String.format("Saque realizado com sucesso! Novo saldo: %d", (saldoTotal - valorSaque)));
        }
    }
}

