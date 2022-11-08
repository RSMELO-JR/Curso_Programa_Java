package Estrutura01_Sequencial;

public class Main06_Concatenar2 {

	public static void main(String[] args) {
		/// Para concatenar varios elementos em um mesmo comando de escrita
		/// Regra geral: "Texto1 %f Texto2 %f Texto3, variavel1, variavel2

		/// %f = ponto flutuante /// %d = inteiro /// %s = texto /// %n = quebra de
		/// linha

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}