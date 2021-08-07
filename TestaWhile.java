
public class TestaWhile {
	public static void main(String[] args) {
		
		int contador = 0; //declaração e inicialização da variável
		
		while(contador <= 10) {
			System.out.println(contador);
			
			//tipos variados de incrementos
			//contador = contador + 1; 
			//contador += 1;
			//++contador; 
			
			contador ++;
		}
		
		System.out.println(contador);
	}
}

/*Todos os operadores de comparação e lógicos são válidos na expressão condicional do while!
Operadores de comparação
< menor, > maior, <= menor ou igual, >= maior ou igual, == igual a  e != diferente de, 

Operadores lógicos:
&& = and
|| = ou
*/
