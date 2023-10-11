package src;

import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        for (int i = 0; i < periodo; i++) {
            valorInicial += valorInicial * taxaJuros;
        }
        System.out.println(String.format("Valor final do investimento: R$ %.2f", valorInicial));
        scanner.close();
    }
}
