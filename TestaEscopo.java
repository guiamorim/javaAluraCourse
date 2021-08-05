
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 2;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = "  +  acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente, não é permitida a sua entrada, pois você é menor de idade e não está acompanhado.");
			}
		}
}
