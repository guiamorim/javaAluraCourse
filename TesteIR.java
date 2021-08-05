
public class TesteIR {
	public static void main(String[] args) {
		
		double salario = 3700.0;
		double ir = 0.00;
		double imposto = 0.00;
		double deducao = 0.00;
		
		if (salario <= 1903.98) {
			System.out.println("Seu rendimento se encontra fora da faixa de incidência do Imposto de renda.");
		}
		else {
			if(salario >= 1903.99 && salario <= 2826.65) {
				
				ir = 7.5;
				imposto = (salario * ir) / 100;
				deducao = 142.80;
				
				System.out.println("O seu salário é R$"+ salario + ", e será atribuído uma alíquota de IR de " + ir + "%.");
				System.out.println("Total do imposto: R$" + imposto + ".");
				System.out.println("Permite a dedução no valor de R$" + deducao + " do imposto aplicado");
			}
			else {
				if(salario >= 2826.66 && salario <= 3751.05) {
					
					ir = 15;
					imposto = (salario * ir) / 100;
					deducao = 354.80;
					
					System.out.println("O seu salário é R$"+ salario + ", e será atribuído uma alíquota de IR de " + ir + "%.");
					System.out.println("Total do imposto: R$" + imposto + ".");
					System.out.println("Permite a dedução no valor de R$" + deducao + " do imposto aplicado");
				}
				else {
					if (salario >= 3751.06 && salario <= 4664.68) {
						
						ir = 22.5;
						imposto = (salario * ir) / 100;
						deducao = 636.13;
						
						System.out.println("O seu salário é R$"+ salario + ", e será atribuído uma alíquota de IR de " + ir + "%.");
						System.out.println("Total do imposto: R$" + imposto + ".");
						System.out.println("Permite a dedução no valor de R$" + deducao + " do imposto aplicado");
					}
					else {
						
						ir = 27.5;
						imposto = (salario * ir) / 100;
						deducao = 869.36;
						
						System.out.println("O seu salário é R$"+ salario + ", e será atribuído uma alíquota de IR de " + ir + "%.");
						System.out.println("Total do imposto: R$" + imposto + ".");
						System.out.println("Permite a dedução no valor de R$" + deducao + " do imposto aplicado");
					}
				}
			}
		}
	}
}
