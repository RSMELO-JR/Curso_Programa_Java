package Estrutura02_Codicional;

import java.util.Scanner;

public class Main01_if_else4_Encadeamento_A34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Que horas são?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			if (hora < 18) {
				System.out.println("Boa Tarde");
			} else {
				System.out.println("Boa Noite");
			}
		}
		
		sc.close();
	}
}