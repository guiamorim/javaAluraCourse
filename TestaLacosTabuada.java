
public class TestaLacosTabuada {
	public static void main(String[] args) {
		
		for(int multiplicador = 0; multiplicador <= 10 ;multiplicador++) {
			System.out.print("Tabuada do " + multiplicador + ":");
			System.out.println();
			
			for(int contador = 0; contador <=10;contador++) {
				
				System.out.print(multiplicador + " x " + contador +" = ");
				System.out.println(multiplicador*contador);
			}
			System.out.println();
		}
	}
}
