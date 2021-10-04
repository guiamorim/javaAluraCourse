
public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira Conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda Conta tem: " + segundaConta.saldo);
		
		System.out.println("Agencia da primeira conta: " + primeiraConta.agencia);
		System.out.println("Agencia da segunda conta: " + segundaConta.agencia);
		
		System.out.println(primeiraConta.titular);
		System.out.println(segundaConta.titular);
		
		System.out.println(primeiraConta.numero);
		System.out.println(segundaConta.numero);
		
		primeiraConta.agencia = 146;
		
		System.out.println("Agencia a segunda conta está na agencia nº. " + primeiraConta.agencia);
		System.out.println("Agencia da segunda conta: " + segundaConta.agencia);
	}
}
