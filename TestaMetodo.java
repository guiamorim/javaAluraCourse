
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.saldo = 100;
		
		contaDoGuilherme.deposita(50);
		System.out.println(contaDoGuilherme.saldo);
		
		boolean conseguiuRetirar  = contaDoGuilherme.saca(20);
		System.out.println(contaDoGuilherme.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaLeidiane = new Conta();
		contaDaLeidiane.saldo = 1000;
		
		System.out.println("Saldo da conta da Leidiane: " + contaDaLeidiane.saldo);
		
		contaDaLeidiane.transfere(300, contaDoGuilherme);
		
		System.out.println("Saldo atual conta do Guilherme: " + contaDoGuilherme.saldo);
		System.out.println("Saldo atual conta da Leidiane: " + contaDaLeidiane.saldo);
		
	}
}
