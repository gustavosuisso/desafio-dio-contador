package edu.gustavo.estruturafor;

public class ExemploBreakContinue {
    
    public static void main(String[] args){

        for(int numero = 1; numero <= 5; numero++){

            if(numero == 3){

                System.out.println("Não pode ter número 3"); /* o 3 não será imprimido e será imprimdio esse aviso no lugar, com o 
                continue pulando para a próxima execução e ignorando o system.out.println a seguir */
                continue; // o continue só muda o fluxo da iteração quando o numero for igual a 3 e depois volta a executar o for normalmente
                // break; já o break para completamente o fluxo da iteração e para o programa

            }

            System.out.println(numero);

        }

    }

}
