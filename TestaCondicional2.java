
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		
		
		System.out.println("Valor de acompanhado = "  +  acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente, n�o � permitida a sua entrada, pois voc� � menor de idade e n�o est� acompanhado.");
			}
		}
}

// || -> OU
// && -> E
// boolean, s� recebe true ou false, n�o aceita n�meros ou qq outro valor.