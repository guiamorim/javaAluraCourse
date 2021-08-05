
public class TestaConversao {
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		//Casting de double para int com perda dos decimais.
		
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		//ponto flutuante com float precisa de ter o f ao final do valor
		//declarado.
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1*valor2;
		System.out.println(total);
	}
}
