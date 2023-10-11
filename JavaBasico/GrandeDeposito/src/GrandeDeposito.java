package src;

import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        scan.close();
        if (valor > 0) {
            System.out.println(String.format("Deposito realizado com sucesso!\r\n" + //
                    "Saldo atual: R$ %.2f", valor));
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}
