package Estrutura02_Codicional;

import java.util.Scanner;

public class Main03_Switch_Case1_A38 {

	public static void main(String[] args) {
		
	// Faça um programa para ler umvalor inteiro de 1 a 7, representando o dia da semana
	// (sendo 1=Dom; 2=Seg; etc...)
	//Escreva na tela o dia da semana correspondente, conforme entrada
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		if (x == 1) {
			dia = "Dom";
		}
		else if (x == 2) {
			dia = "Seg";
		}
		else if (x == 3) {
			dia = "Ter";
		}
		else if (x == 4) {
			dia = "Qua";
		}
		else if (x == 5) {
			dia = "Qui";
		}
		else if (x == 6) {
			dia = "Sex";
		}
		else if (x == 7) {
			dia = "Sáb";
		}
		else {
			dia = "valor inválido";
		}
		
		System.out.println("Dia da Semana : " + dia);
		
		sc.close();
	}

}
