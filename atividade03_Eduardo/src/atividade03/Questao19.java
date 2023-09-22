package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois números a seguir");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		if (num1 > num2) {
			System.out.println(num1 + " " + num2);
		} else if (num1 == num2) {
			System.out.println("Números iguais " + num1 + " " + num2);
		} else
			System.out.println(num2 + " " + num1);
		sc.close();
	}
}
