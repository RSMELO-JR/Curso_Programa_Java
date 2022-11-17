package Estrutura02_Codicional;

import java.util.Scanner;

public class Main04_Expr_Condicional2_Ternaria_A39 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double preço = 34.65;
		double desconto = (preço < 20.0) ? preço * 0.1 : preço * 0.05;
				
		System.out.println(desconto);
		
		sc.close();
		
	}
}
