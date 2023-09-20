package atividade03;

import java.util.Scanner;

public class RelatorioClinica47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadePacientes = 0;
        int somaIdadeHomens = 0;
        int quantidadeMulheresAltasPesoAlto = 0;
        int quantidadePessoasIdade18a25 = 0;
        String nomePacienteMaisVelho = "";
        String nomeMulherMaisBaixa = "";
        int idadeMaisVelho = Integer.MIN_VALUE;
        double alturaMulherMaisBaixa = Double.MAX_VALUE;

        System.out.println("Informe os dados dos pacientes ou digite 'fim' no nome do último paciente.");
        
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);
            
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            scanner.nextLine();  // Limpar o buffer
            
            quantidadePacientes++;
            
            if (sexo == 'M' || sexo == 'm') {
                somaIdadeHomens += idade;
            }
            
            if (sexo == 'F' || sexo == 'f') {
                if (altura >= 1.60 && altura <= 1.70 && peso > 70) {
                    quantidadeMulheresAltasPesoAlto++;
                }
                if (altura < alturaMulherMaisBaixa) {
                    nomeMulherMaisBaixa = nome;
                    alturaMulherMaisBaixa = altura;
                }
            }
            
            if (idade >= 18 && idade <= 25) {
                quantidadePessoasIdade18a25++;
            }
            
            if (idade > idadeMaisVelho) {
                nomePacienteMaisVelho = nome;
                idadeMaisVelho = idade;
            }
        }
        
        System.out.println("Relatório da Clínica:");
        System.out.println("Quantidade de pacientes: " + quantidadePacientes);
        
        if (quantidadePacientes > 0) {
            double mediaIdadeHomens = (double) somaIdadeHomens / quantidadePacientes;
            System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        }
        
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + quantidadeMulheresAltasPesoAlto);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadePessoasIdade18a25);
        System.out.println("Nome do paciente mais velho: " + nomePacienteMaisVelho);
        System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);
        
        scanner.close();
    }
}
