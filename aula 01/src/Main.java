import java.util.Scanner;

public class Main { 
	//a classe precisa ter o msm nome do arquivo fonte
	
	public static void main(String[] args) {
		//m�todo de entrada por onde come�a a  executar
		//atalho main enter
		
		try {
			
		
		System.out.print("Digite seu nome: ");
		//print sem 'ln' n�o pula linha
		
		Scanner leitor = new Scanner(System.in);
		// classe  que permite fazer leitura do que � digitado
		
		String nome = leitor.nextLine();
		//pega a pr�xima linha e coloca na vari�vel(nome)o que for digitado
		
		System.out.println("Bem vindo "+nome+" ao mundo Java");
		//printa na tela o que foi digitado 
		//atalho Sysout enter
		
		leitor.close();
		//fecha o scanner de leitura do teclado
		// apenas quendo for usado scanner
		
		}
		catch (Exception e) {
			
			System.out.println("Houve algum erro de entrada de dados");
		}
		//try catch facilita na hora de indentifica quando houver algum erro no codigo 
		//atalho try enter
		
	}	
	
}
