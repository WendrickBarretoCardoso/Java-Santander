package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList <String> ativos = new ArrayList<String>();
    int quantidadeAtivos = scan.nextInt();

    for (int i = 0; i <= quantidadeAtivos; i++) {
      String codigoAtivo = scan.nextLine();
      ativos.add(codigoAtivo);
    }
    scan.close();
    Collections.sort(ativos);

    for (int i = 0; i <= quantidadeAtivos; i++) {
      System.out.println(ativos.get(i));
    }
    
  }
}