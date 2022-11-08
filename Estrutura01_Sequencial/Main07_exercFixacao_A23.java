package Estrutura01_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main07_exercFixacao_A23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
	//%f = ponto flutuante; %d = inteiro; %s = texto; %n = quebra linha
	//A23 - EXERCICIO FIXAÇÃO
	//Em um novo programa, inicie as seguites variáveis:
	//Usadndo os valores da variáveis, produza a seguinte saída:
		//Products:
		//Computer, with price is %2000.0;
		//Office desk, with price is $650.0;
		//Record: 30 years old, code 5290 and gender: F;
		//Measue(medida) with eight decimal places: 53,23456700
		//Us decimal point: 53.235
		
		
		String prod1 = "computer";
		String prod2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender ='F';
		
		double price1 = 2000.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, with price is US$ %.2f%n", prod1, price1);
		System.out.printf("%s, with price is US$%.2f%n", prod2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places) %.3f%n", measure);
		
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("(Us decimal point: %.3f%n", measure);
		
		sc.close();
		
	}
}
