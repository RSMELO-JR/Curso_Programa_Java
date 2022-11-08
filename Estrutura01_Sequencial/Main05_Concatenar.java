package Estrutura01_Sequencial;

public class Main05_Concatenar {

	public static void main(String[] args) {
		/// Regra geral para print e println:
		/// elemento1 + elemento2 + elemento3 + ... + elementoN

		double x = 10.35784;

		System.out.println(x);

		System.out.println("RESULTADO = " + x + " METROS");

		/// Para concatenar varios elementos em um mesmo comando de escrita
		/// Regra geral: "Texto1 %f Texto2 %f Texto3, variavel1, variavel2
		/// %f = ponto flutuante /// %n quebra de linha

		/// System.out.printf("RESULTADO = %.2f metros%n", x)

		System.out.printf("RESULTADO = %.2f metros%n", x);

	}

}