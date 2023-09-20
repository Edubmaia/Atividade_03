package atividade03;

import java.util.Scanner;

public class Aniversariantes23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados da primeira pessoa:");
        String nome1 = scanner.nextLine();
        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();

        System.out.println("Informe os dados da segunda pessoa:");
        scanner.nextLine(); 
        String nome2 = scanner.nextLine();
        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();

        if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
            System.out.println(nome1 + " faz aniversário primeiro.");
        } else if (mes2 < mes1 || (mes2 == mes1 && dia2 < dia1)) {
            System.out.println(nome2 + " faz aniversário primeiro.");
        } else {
            System.out.println(nome1 + " e " + nome2 + " fazem aniversário no mesmo dia.");
        }

        scanner.close();
    }
}
