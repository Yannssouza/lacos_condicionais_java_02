package Atividades;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        int produto, preco, quantidade, total;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o numero do produto:");
        produto = leia.nextInt();
        System.out.println("Digite a quantidade de produtos:");
        quantidade = leia.nextInt();

        leia.close();

        switch (produto) {
            case 1:
                preco = 10;
                total = preco * quantidade;
                System.out.println("Produto: Cachorro Quente.");
                System.out.println("Valor total: " + "R$" + total);
                break;
            case 2:
                preco = 15;
                total = preco * quantidade;
                System.out.println("Produto: X-Salada.");
                System.out.println("Valor total: " + "R$" + total);
                break;
            case 3:
                preco = 18;
                total = preco * quantidade;
                System.out.println("Produto: X-Bacon.");
                System.out.println("Valor total: " + "R$" + total);
                break;
            case 4:
                preco = 12;
                total = preco * quantidade;
                System.out.println("Produto: Bauru.");
                System.out.println("Valor total: " + "R$" + total);
                break;
            case 5:
                preco = 8;
                total = preco * quantidade;
                System.out.println("Produto: Refrigerante.");
                System.out.println("Valor total: " + "R$" + total);
                break;
            case 6:
                preco = 13;
                total = preco * quantidade;
                System.out.println("Produto: Suco de Laranja.");
                System.out.println("Valor total: " + "R$" + total);
                break;
            default:
                System.out.println("Esse código não existe no sistema");
                break;
        }
    }

}
