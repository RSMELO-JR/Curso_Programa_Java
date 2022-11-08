package Estrutura01_Sequencial;

public class Main08_CastingA24 {

	public static void main(String[] args) {
		
		int x, y;
		x = 5; y = 2;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
	//variável com ponto flutuante
		
		int a;
		double b;
		a = 5;
		b = 2 * a;
		
	//calculando a área ==>>> formula da área: (b+B)/s*h;
		double c, C, h, area;
		c = 6.0;
		C = 8.0;
		h = 5.0;
		area = (c + C) / 2.0 * h;
		
		System.out.println(area);
		System.out.println();
		
	//variaveis do tipo inteiro
		int d, e;
		double resultado;
		d = 5;
		e = 2;
		resultado = d / e;
		System.out.println(resultado);
		
		resultado = (double) d / e;
		System.out.println(resultado);
		System.out.println();
		

	}

}
