package Atividades;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        int n;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número:");
        n = leia.nextInt();

        leia.close();

        if (n % 2 == 0) {
            System.out.print("O número " + n + " é par!");
        } else {
            System.out.print("O número " + n + " é ímpar!");
        }

        if (n >= 0) {
            System.out.println(" e positivo!");
        } else {
            System.out.println(" e negativo!");
        }
    }
}
