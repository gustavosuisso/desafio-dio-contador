package edu.gustavo.estruturadowhile;

import java.util.Random;

public class ExemploDoWhile {

    // Do While executa o código ao menos uma vez antes de verificar se é verdadeiro ou falso
    // primeiro ele executa, depois faz a verificação.
    
    public static void main(String[] args){

        System.out.println("Discando...");

        do {

            System.out.println("Telefone tocando...");

        } while(tocando());

        System.out.println("Alô!!!!");

    }

    private static boolean tocando(){

        boolean atendeu = new Random().nextInt(3) == 1; // temos um valor aleatorio entre 1 e 3, se for igual a 1 quer dizer que atendeu
        System.out.println("Atendeu? " + atendeu);
        
        return !atendeu; // negamos o valor de atendeu, para caso retorne um true, vire um false e o usuário saiba que parou de tocar

    }

}
