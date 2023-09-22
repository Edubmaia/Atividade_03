package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao61 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas");
		int linhas = sc.nextInt();
		for (int i = 0; i < linhas; i++) {
			System.out.println();
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
		}
		sc.close();
	}
}
