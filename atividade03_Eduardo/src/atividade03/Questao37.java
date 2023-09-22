package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao37 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		int fatorial = num;
		if (num == 0) {
			System.out.println("Fatorial de 0! é 1");
		} else if (num == 1) {
			System.out.println("Fatorial de 1! é 1");
		} else {
			for (int i = num; i > 1; i--) {
				fatorial = fatorial * (i - 1);
			}
			System.out.println(" O fatorial de " + num + "! é: " + fatorial);
		}
		sc.close();
	}
}
