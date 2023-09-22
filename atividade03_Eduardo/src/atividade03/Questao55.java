package atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Questao55 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int minutos = 100;
		int minutos_vai = 50;
		int minutos_ligacao = 0;
		double saldo = 50.0;
		char tipo_ligacao = 'a';
		String resp = "sim";
		do {
			System.out.println("\n Voce possui R$ " + saldo + " de saldo e " + minutos + " de minutos \n");
			System.out.println(
					"Digite o tipo de ligação 'o' para outas operadoras, 'v' própria vai-vai 'f' telefone fixo");
			tipo_ligacao = sc.next().charAt(0);
			System.out.println("Digite a quantidade de minutos");
			minutos_ligacao = sc.nextInt();
			if (tipo_ligacao == 'o') {
				if ((saldo > 0) || (minutos > 0)) {
					if (minutos > 0) {
						minutos = minutos - minutos_ligacao;
						if (minutos < 0) {
							minutos = (int) (Math.abs(minutos));
							System.out.println("Minutos excedentes = " + minutos);
							saldo = saldo - (minutos * 0.65);
							minutos = 0;
						}
					} else {
						saldo = saldo - (minutos_ligacao * 0.65);
					}
				} else {
					System.out.println("Vc não tem créditos nem minutos suficientes para ligar para outros números");
				}
			}
			if (tipo_ligacao == 'v') {
				if ((saldo > 0) || (minutos > 0)) {
					minutos_vai = minutos_vai - minutos_ligacao;
					cont++;
					if ((cont == 1) && (minutos_vai < 0) && (minutos > 0)) {
						minutos = 150 - (minutos_vai * (-1));
					}
					if ((cont == 1) && (minutos <= 0)) {
						minutos = (int) (Math.abs(minutos));
						System.out.println("Minutos excedentes = " + minutos);
						saldo = saldo - (minutos * 0.2);
						minutos = 0;
					}
					if (((minutos > 0) && ((minutos_vai < 0)) && (cont > 1))) {
						minutos = minutos - minutos_ligacao;
						if (minutos < 0) {
							minutos = (int) (Math.abs(minutos));
							System.out.println("Minutos excedentes = " + minutos);
							saldo = saldo - (minutos * 0.2);
							minutos = 0;
						}
					}
					if ((minutos <= 0) && (minutos_vai < 0)) {
						saldo = saldo - (minutos_ligacao * 0.2);
					}
				} else {
					System.out.println("Vc não tem créditos nem minutos sufientes para ligar para números vai-vai");
				}
			}
			if (tipo_ligacao == 'f') {
				if ((saldo > 0) || (minutos > 0)) {
					if (minutos > 0) {
						minutos = minutos - (minutos_ligacao / 2);
						if (minutos < 0) {
							minutos = (int) (Math.abs(minutos));
							System.out.println("Minutos excedentes = " + minutos);
							saldo = saldo - (minutos * 0.65);
							minutos = 0;
						}
					} else {
						saldo = saldo - (minutos_ligacao * 0.65);
					}
				} else {
					System.out.println("Vc não tem créditos nem minutos sufientes para ligar para números fixos");
				}
			}
			System.out.println("Deseja fazer mais ligações?");
			sc.nextLine();
			resp = sc.nextLine();
			if (saldo < 0) {
				saldo = Math.abs(saldo);
				System.out.println("\n Voce deve " + saldo + "R$");
				break;
			}
		} while (resp.equals("sim"));
		sc.close();
	}
}
