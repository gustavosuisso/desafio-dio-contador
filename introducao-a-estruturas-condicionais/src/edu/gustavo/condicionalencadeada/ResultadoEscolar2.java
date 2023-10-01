package edu.gustavo.condicionalencadeada;

// condicionais encadeadas

public class ResultadoEscolar2 {
    
    public static void main(String[] args){

        int nota = 7;

        // condicinal encadeada onde podemos ter 3 ou mais condições
        if(nota >= 7){

            System.out.println("Parabéns, você foi aprovado.");

        } else if(nota >= 5 || nota < 7){

            System.out.println("Você ficou de recuperação.");

        } else {

            System.out.println("Você foi reprovado.");

        }

    }

}
