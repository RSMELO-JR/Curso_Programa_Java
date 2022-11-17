package Estrutura02_Codicional;

import java.util.Scanner;

public class Main04_Expr_Condicional1_Ternaria_A39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//EXPRESSÃO CONDICIONAL TERNÁRIA
	//Estrutura opcional do if else qdo se deseja decidir um valor com base em uma condição
	//Sintaxa: (condição) ? valor_se_verdadeiro: valor_se_falso
	//exemplo1: (2 . 4) ? 50 : 80 >>>>>resp.: 80
	//exemplo2: (10 != 3) ? "Maria" : "Alex"
		
		double preço = 34.5;
		double desconto;
		
		if (preço < 20.0) {
			desconto = preço * 0.1;
		}
		else {
			desconto = preço * 0.05;
		}
		
		System.out.println(desconto);
		
		sc.close();
	}

}
