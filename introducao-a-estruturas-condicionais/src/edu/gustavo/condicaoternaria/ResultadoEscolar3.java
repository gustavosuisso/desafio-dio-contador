package edu.gustavo.condicaoternaria;

// exercicitando condição ternaria
public class ResultadoEscolar3 {
    
    public static void main(String[] args){

        int nota = 10;
        // abreviando os exercicios anteriores com operador ternário, já armazenando o resultado em uma variavel e o imprimindo
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        
        // utilizando operador ternário com mais uma condição
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "De recuperação" : "Reprovado";

        System.out.println(resultado);

    }

}
