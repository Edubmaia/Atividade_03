package atividade03;

import java.util.Scanner;
import java.util.Random;

public class SorteioNumeros35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem sorteados: ");
        int quantidadeNumeros = scanner.nextInt();

        System.out.print("Digite o valor mínimo da faixa de sorteio: ");
        int minimo = scanner.nextInt();

        System.out.print("Digite o valor máximo da faixa de sorteio: ");
        int maximo = scanner.nextInt();

        if (minimo >= maximo) {
            System.out.println("O valor mínimo deve ser menor que o valor máximo.");
        } else {
            Random random = new Random();
            System.out.println("Números sorteados:");

            for (int i = 0; i < quantidadeNumeros; i++) {
                int numeroSorteado = random.nextInt(maximo - minimo + 1) + minimo;
                System.out.println(numeroSorteado);
            }
        }

        scanner.close();
    }
}
