
public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Seja bem vindo, voc� � maior de idade");
		} else {
			if (quantidadePessoas > 1) {
				System.out.println("Seja bem vindo, voc� � menor de idade, mas est� acompanhado.");
			}
			else {
			System.out.println("Infelizmente, n�o � permitida a sua entrada, pois voc� � menor de idade e n�o est� acompanhado.");
			}
		}
	}
}

