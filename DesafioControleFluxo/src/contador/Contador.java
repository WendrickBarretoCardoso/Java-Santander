package src.contador;

import java.util.Scanner;
import src.exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();
        scan.close();

        try {          
        contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int par1, int par2) throws ParametrosInvalidosException {
        if (par1 >= par2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        } else {
            for (int i = 1; i <= (par2 - par1); i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
