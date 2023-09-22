package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento");
		int ano = sc.nextInt();

		System.out.println("Digite o ano atual");
		int ano_atual = sc.nextInt();

		int idade = ano_atual - ano;
		System.out.println("Sua idade: " + idade);

		sc.close();

	}

}
