package Atividades;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        String nome;
        int cargo, reajuste, salario, novoSalario;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = leia.nextLine();
        System.out.println("Digite o Código do Cargo:");
        cargo = leia.nextInt();
        System.out.println("Digite o Salário:");
        salario = leia.nextInt();

        leia.close();

        switch (cargo) {
            case 1:
                reajuste = 10;
                novoSalario = salario + (reajuste * salario);
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Gerente");
                System.out.println("Salário: " + "R$" + novoSalario);
                break;
            case 2:
                reajuste = 7;
                novoSalario = salario + (reajuste * salario);
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Vendedor");
                System.out.println("Salário: " + "R$" + novoSalario);
                break;
            case 3:
                reajuste = 9;
                novoSalario = salario + (reajuste * salario);
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Supervisor");
                System.out.println("Salário: " + "R$" + novoSalario);
                break;
            case 4:
                reajuste = 6;
                novoSalario = salario + (reajuste * salario);
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Motorista");
                System.out.println("Salário: " + "R$" + novoSalario);
                break;
            case 5:
                reajuste = 5;
                novoSalario = salario + (reajuste * salario);
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Estoquista");
                System.out.println("Salário: " + "R$" + novoSalario);
                break;
            case 6:
                reajuste = 8;
                novoSalario = salario + (reajuste * salario);
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Técnico de TI");
                System.out.println("Salário: " + "R$" + novoSalario);
                break;
            default:
                System.out.println("Esse código não existe no sistema");
                break;
        }
    }

}
