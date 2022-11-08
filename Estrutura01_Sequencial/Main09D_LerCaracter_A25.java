package Estrutura01_Sequencial;

import java.util.Scanner;

public class Main09D_LerCaracter_A25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//Para ler uma posição de caracter declarado:
		char x;
		x = sc.next().charAt(5); //ler o caracter sa posição 2
		System.out.println("Vc Digitou: " + x);
		
		sc.close();
				
	}

}
