package Estrutura02_Codicional;

import java.util.Scanner;

public class Main03_Switch_Case2_A38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Dom";
		case 2:
			dia = "Seg";
		case 3:
			dia = "Ter";
		case 4:
			dia = "Qua";
		case 5:
			dia = "Qui";
		case 6:
			dia = "Sex";
		case 7:
			dia = "Sab";
			break;
		default:
			dia = "valor inválido";
			break;
		}
		
		System.out.println("Dia da Semana: " + dia);
		
		sc.close();
	}

}
