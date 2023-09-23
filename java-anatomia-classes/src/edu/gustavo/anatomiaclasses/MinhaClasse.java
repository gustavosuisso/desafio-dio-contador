package edu.gustavo.anatomiaclasses;
public class MinhaClasse {
    
    public static void main(String[] args){

        System.out.println("Essa é a classe para demonstrar a anatomia das classes no Java.");


        // a palavra reservada final significa que essa variavel nunca poderá ser alterada, ela estar  toda em letra maiuscula é uma convenção para informar isso
        final String BR = "Brasil";
        
        // a variavel é uma referencia a um valor que está na memória

        String meuNome = "Gustavo";

        int anoFabricacao = 2023;

        boolean verdadeira = true;

        anoFabricacao = 2022;

        String primeiroNome = "Gustavo Henrique";
        String sobrenome = "Barreto Suisso";

        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
        System.out.println(nomeCompleto);

    }

    public static int somar(int n1, int n2){

        int soma = n1 + n2;
        return soma;

    }

    public static String nomeCompleto(String primeiroNome, String sobrenome){

       // String nome = primeiroNome + " " + sobrenome;
       // return "Seu nome completo é: " + nome;

       // usando o méotodo concat da classe String para concatenar strings
       return primeiroNome.concat(" ").concat(sobrenome);

    }

}
