package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da despesa");
		double valor_despesa = sc.nextDouble();

		double comissao_garcom = 0.1 * valor_despesa;

		System.out.println("O valor dos 10% do garçom é de: " + comissao_garcom);

		sc.close();

	}

}
