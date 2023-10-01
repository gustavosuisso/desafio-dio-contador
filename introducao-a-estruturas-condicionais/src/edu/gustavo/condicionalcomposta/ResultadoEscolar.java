package edu.gustavo.condicionalcomposta;

// exercitando condicional composta

public class ResultadoEscolar {
    
    public static void main(String[] args){

        int nota = 7;

        // aqui temos um condicional composta, onde temos um fluxo quando for verdadeiro e um quando for falso.
        // eu sempre coloco blocos, mas poderia utilizar sem desde que houvesse apenas uma instrução dentro do if
        if(nota >= 7){

            System.out.println("Parabéns, você foi aprovado.");

        } else {

            System.out.println("Você foi reprovado.");

        }

    }

}
