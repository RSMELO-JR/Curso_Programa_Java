package Estrutura01_Sequencial;

import java.util.Scanner;

public class Main09G_quebraLinhaPendente_A26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
	
	//Qdo vc usa um comando de linha diferente do NEXTLINE e faz uma quebra de linha, essa quebra de linha fica "pendente"
	//na entrada padrão e é preciso incluir um novo NEXTLINE extra no final de um novo comando;
		
		x = sc.nextInt();
		//NEXTLINE EXTRA
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}

}
