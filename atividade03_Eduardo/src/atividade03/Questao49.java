package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao49 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		long x = 0;
		long x_atual = 1;
		long x_anterior = 1;
		System.out.println("Digite a quantidade de números que você deseja visualizar da seq. de fibbonacci");
		int fibo = sc.nextInt();
		long vet[] = new long[fibo];
		for (int i = 0; i < fibo; i++) {
			if (i == 0) {
				vet[i] = 1;
			} else if (i == 1) {
				vet[i] = 1;
			} else {
				x = x_atual + x_anterior;
				x_anterior = x_atual;
				x_atual = x;
				vet[i] = x;
			}
		}
		for (int j = 0; j < fibo; j++) {
			System.out.print(vet[j] + ",");
		}
		sc.close();
	}
}
