
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo=300;
		
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		System.out.println(primeiraConta);
		
		Conta segundaConta = new Conta();
		segundaConta = primeiraConta;
		
		System.out.println(segundaConta);
		
		System.out.println(segundaConta.saldo);
		segundaConta.saldo += 50;
		
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
	}
}
