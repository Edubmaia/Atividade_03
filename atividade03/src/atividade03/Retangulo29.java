package atividade03;

import java.util.Scanner;

public class Retangulo29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do vértice superior esquerdo (x1, y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Digite as coordenadas do vértice inferior direito (x2, y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 == x2 || y1 == y2) {
            if (x1 == x2 && y1 == y2) {
                System.out.println("É um ponto.");
            } else if (x1 == x2) {
                System.out.println("É uma reta vertical.");
            } else {
                System.out.println("É uma reta horizontal.");
            }
        } else {
            System.out.println("É um retângulo.");
            int largura = Math.abs(x2 - x1);
            int altura = Math.abs(y2 - y1);
            int area = largura * altura;
            System.out.println("Área do retângulo: " + area);

            System.out.println("Digite as coordenadas de outro ponto (x, y):");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < x1 && y < y1) {
                System.out.println("Está acima e à esquerda do retângulo.");
            } else if (x > x2 && y < y1) {
                System.out.println("Está acima e à direita do retângulo.");
            } else if (x < x1 && y > y2) {
                System.out.println("Está embaixo e à esquerda do retângulo.");
            } else if (x > x2 && y > y2) {
                System.out.println("Está embaixo e à direita do retângulo.");
            } else if (x < x1 && y >= y1 && y <= y2) {
                System.out.println("Está à esquerda do retângulo.");
            } else if (x > x2 && y >= y1 && y <= y2) {
                System.out.println("Está à direita do retângulo.");
            } else if (x >= x1 && x <= x2 && y < y1) {
                System.out.println("Está acima do retângulo.");
            } else if (x >= x1 && x <= x2 && y > y2) {
                System.out.println("Está embaixo do retângulo.");
            } else {
                System.out.println("Está dentro do retângulo.");
            }
        }

        scanner.close();
    }
}
