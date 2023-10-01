package edu.gustavo.condicionalsimples;

// exercitando apenas a condicional simples

public class CaixaEletronico{

    public static void main(String[] args){

        double saldo = 25.0;
        double valorSaque = 17.0;

        // condicional simples, com apenas um if que verifica se a condição é verdadeira ou falsa
        if(valorSaque <= saldo){

            saldo -= valorSaque;
            System.out.println("Seu saque de " + valorSaque + " foi realizado com sucesso.");

        }

        System.out.println("Valor do saldo: " + saldo);

    }

}