
public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Seja bem vindo, você é maior de idade");
		} else {
			if (quantidadePessoas > 1) {
				System.out.println("Seja bem vindo, você é menor de idade, mas está acompanhado.");
			}
			else {
			System.out.println("Infelizmente, não é permitida a sua entrada, pois você é menor de idade e não está acompanhado.");
			}
		}
	}
}

