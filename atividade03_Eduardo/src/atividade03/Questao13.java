package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a primeira nota do aluno");
		double nota1 = sc.nextDouble();

		System.out.println("Informe a segunda nota do aluno");
		double nota2 = sc.nextDouble();

		System.out.println("Informe a terceira nota do aluno");
		double nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media < 5) {
			System.out.println("Reprovado");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno em recuperação, a seguir digite a nota da prova final");
			double prova_final = sc.nextDouble();

			if (prova_final < 5) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Aprovado");
			}
		}

		else {
			System.out.println("Aprovado");

		}

		sc.close();

	}

}
