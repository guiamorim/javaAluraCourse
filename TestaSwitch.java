
public class TestaSwitch {
	public static void main(String[] args) {
	System.out.println("Indique o n�do m�s desejado:");

	int mes = 10;
	System.out.println("O n� do m�s selecionado foi " + mes +".");
	
		switch(mes) {
			case 1:
				System.out.println("O m�s correspondente � Janeiro.");
				break;
			case 2:
				System.out.println("O m�s correspondente � Fevereiro.");
				break;
			case 3:
				System.out.println("O m�s correspondente � Mar�o.");
				break;
			case 4:
				System.out.println("O m�s correspondente � Abril.");
				break;
			case 5:
				System.out.println("O m�s correspondente � Maio.");
				break;
			case 6:
				System.out.println("O m�s correspondente � Junho");
				break;
			case 7:
				System.out.println("O m�s correspondente � Julho.");
				break;
			case 8:
				System.out.println("O m�s correspondente � Agosto.");
				break;
			case 9:
				System.out.println("O m�s correspondente � Setembro.");
				break;
			case 10:
				System.out.println("O m�s correspondente � Outubro.");
				break;
			case 11:
				System.out.println("O m�s correspondente � Novembro.");
				break;
			case 12:
				System.out.println("O m�s correspondente � Dezembro.");
				break;
		    default:
		    	System.out.println("Op��o inv�lida, n�o corresponde a um m�s.");
		    	break;
		}
	}
}
