package atividade03;

import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int linhas = scanner.nextInt();
        
        for (int i = 1; i <= linhas; i++) {
            // Imprime espaços em branco antes dos asteriscos
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }
            
            // Imprime os asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Muda para a próxima linha
            System.out.println();
        }
        
        scanner.close();
    }
}
