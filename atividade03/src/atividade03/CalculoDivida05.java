package atividade03;

import java.util.Scanner;

public class CalculoDivida05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial da dívida: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensais (em decimal): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite a quantidade de meses: ");
        int numeroMeses = scanner.nextInt();

        double valorFinal = valorInicial + (valorInicial * taxaJuros * numeroMeses);

        System.out.println("O valor final da dívida é: " + valorFinal);

        scanner.close();
    }
}
