package Atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
    int n1, n2, n3;

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o valor A:");
    n1 = leia.nextInt();
    System.out.println("Digite o valor B:");
    n2 = leia.nextInt();
    System.out.println("Digite o valor C:");
    n3 = leia.nextInt();

    leia.close();

    if (n1 + n2 > n3) {
        System.out.println("A Soma de A + B é Maior do que C.");
    } else if (n1 + n2 < n3) {
        System.out.println("A Soma de A + B é Menor do que C.");
    } else {
        System.out.println("A Soma de A + B é Igual do que C.");
    }

    }
}
