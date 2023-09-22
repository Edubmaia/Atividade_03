package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao25 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int aux = 0;
		System.out.println("Digite as horas");
		horas = sc.nextInt();
		if (horas < 0 || horas > 23) {
			while (aux != 1) {
				System.out.println("Você digitou um valor errado, digite as horas entre o valor 0 e 23");
				horas = sc.nextInt();
				if (horas < 0 || horas > 23) {
					System.out.println("Tente novamente pois...");
				} else
					aux = 1;
			}
			aux = 0;
		}
		System.out.println("Digite os minutos");
		minutos = sc.nextInt();
		if (minutos < 0 || minutos > 59) {
			while (aux != 1) {
				System.out.println("Você digitou um valor errado, digite os minutos entre o valor 0 e 59");
				minutos = sc.nextInt();
				if (minutos < 0 || minutos > 59) {
					System.out.println("Tente novamente pois...");
				} else
					aux = 1;
			}
		}
		aux = 0;
		System.out.println("Digite os segundos");
		segundos = sc.nextInt();
		if (segundos < 0 || segundos > 59) {
			while (aux != 1) {
				System.out.println("Você digitou um valor errado, digite os segundos entre o valor 0 e 59");
				segundos = sc.nextInt();
				if (segundos < 0 || segundos > 59) {
					System.out.println("Tente novamente pois...");
				} else
					aux = 1;
			}
		}
		aux = 0;
		System.out.println("São: " + horas + ":" + minutos + ":" + segundos);
		sc.close();
	}

}
