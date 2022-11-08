package Estrutura01_Sequencial;

import java.util.Locale;

public class Main04_printf {

	public static void main(String[] args) {
		/// Para formatar a qtd de casas decimais após o ponto

		double x = 10.35784;

		System.out.println(x);

		System.out.printf("%.2f%n", x);

		Locale.setDefault(Locale.US);
		
		System.out.printf("%.4f%n", x);
	}

}
