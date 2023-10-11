package edu.gustavo.estruturafor;

public class ExemploForArray {
    
    public static void main(String[] args){


        // array é um conjunto de elementos de um tipo correspondente
        // em arrays o indice começa em 0
        String[] alunos = {"Gustavo", "Ana", "Beatriz", "Joao", "Yan"};

        /* 
        for(int i = 0; i < alunos.length; i++){

            System.out.println("O aluno no indice " + i + " é:" + alunos[i]);

        }
        */
        
        // utlizando for each para pegar os elementos do array
        // para cada String aluno em alunos faça
        for(String aluno : alunos){

            System.out.println(aluno);

        }

    }

}
