package desafio_contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int primeiroParametro;
		int segundoParametro;
		
		System.out.println("Por favor, digite o primeiro parâmetro do contador: ");
		primeiroParametro = scanner.nextInt();
		
		System.out.println("Agora digite o segundo parâmetro: ");
		segundoParametro = scanner.nextInt();
		
		try {
		
		contar(primeiroParametro, segundoParametro);
		
		}catch(ParametrosInvalidosException e) {
			
			e.printStackTrace();
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
			
		}
	}
	
	public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
		
		if(primeiroParametro > segundoParametro) {
			
			throw new ParametrosInvalidosException();
			
		}
		
		int parametroFinal = segundoParametro - primeiroParametro;
		
		
		for(int i = 1; i <= parametroFinal; i++) {
			
			System.out.println("Imprimindo o número: " + i);
			
		}
		
	}
	
}
