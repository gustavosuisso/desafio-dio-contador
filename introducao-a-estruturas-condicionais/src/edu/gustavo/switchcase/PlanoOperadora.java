package edu.gustavo.switchcase;

public class PlanoOperadora {

    public static void main(String[] args){

        String plano = "M"; // T | M | B

        /* a proposta desse switch case é termos um switch case sem breaks, onde daremos continuidade
         * ás instruções após a primeira a ser localizeda e com esse objetivo colocamos os planos
         * na ordem decrescente do maior ao menor, assim se escolhermos o plano T, ele terá acesso
         * ás outras vantagens do plano M e B, se escolhermos o plano M ele terá a vantagem do plano B e etc
         */
        switch (plano){

            case "T": {

                System.out.println("5gb de Youtube");
            

            }

            case "M": {

                System.out.println("Whatsapp e Instagram grátis.");
                

            }

            case "B": {

                System.out.println("100 minutos de ligação.");
                

            }
        }

    }
    
}
