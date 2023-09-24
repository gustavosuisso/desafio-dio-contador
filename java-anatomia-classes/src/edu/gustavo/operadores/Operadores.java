package edu.gustavo.operadores;

public class Operadores {
    
    public static void main(String[] args){
        
        String nomeCompleto = "LINGUAGEM" + "JAVA"; // concatenando as strings, ou seja, juntando elas.
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        
        concatenacao = 1 + 1 + 1 + "1"; /* irá somar os três primeiros normalmente, já que são 
        numeros inteiros e irá concatenar com a String no final, formando assim "31" e sobrescreverá o "?" com que a variavel
        foi inicializada  */
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1; // resultado será a string "1111"
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1"; // resultado será a string "1111"
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; // resultado será a string "1111"
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); // resultado será a string "13"
        System.out.println(concatenacao);

        // testando operadores unários

        int numero = 5; // transformaremos o numero em negativo com o operador unário de valor negativo -
        numero = - numero; // estamos dizendo que o número recebe ele mesmo de forma negativa

        System.out.println(numero);

        // deixando o número positivo novamente
        numero = numero * -1; // multiplicamos o número negativo por -1 para torna-lo um número positivo

        System.out.println(numero);

        // operador de incremento
        int numeroIncrementado = 5;
        // numero++; // irá incrementar (aumentar) somando 1 ao valor atual, resultando no numero 6
        // incrimento pós impressão
        //System.out.println(numero++); // o número a ser imprimido nessa linha será 5, pois primeiro ele imprime e depois incrimenta
        // incremento antes da impressão
        System.out.println(++numeroIncrementado); // o número imprimido nessa linha será 6, pois ele irá incrementar primeiro e depois irá imprimir o número

        // operador de decremento
        int numeroDecrementado = 5;
        // numero--; irá decrementar (diminuir) o valor, subtraindo em 1 o valor atual, resultando no número 4
        // decremento pós impressão
        // System.out.println(numero--) // o número a ser imprimdio será 5 pois primeiro o valor será impresso, depois diminuido
        // decremento antes da impressão
        System.out.println(--numeroDecrementado); // o número imprimido aqui será 4, pois ele primeiro diminui e depois imprime o valor

        // negando expressões booleanas e invertendo seu valor
        boolean variavel = false;

        System.out.println(!variavel); // seu valor será true pois adicionamos ! antes do nome da variavel e invertemos seu valor
        // apesar de invertermos o valor na hora da impressão acima, nossa variavel permanecerá false, mudando somente ao atribuirmos um novo valor
        System.out.println(variavel); // será false
        // atribuindo o valor invertido na variavel e mudando seu valor
        variavel = !variavel;
        System.out.println(variavel); // será true

        // operador ternário
        // <Expressão condicional> ? <Caso a condição seja true> : <Caso a condição seja false>;
        boolean ternario = true;
        String teste;
        teste = ternario ? "Verdadeiro" : "Falso";
        System.out.println(teste);

        // continuando os exercicios sobre operador ternário
        int a = 5;
        int b = 6;
        if(a == b) {

            System.out.println("Os valores são iguais.");

        } else {

            System.out.println("Os valores são diferentes.");

        }
    
        // replicando o if acima só que com operador ternário
        /* condição antes da interrogação, após a interrogação é o retorno caso seja verdadeiro,
         *  após os dois pontos é o retorno caso a condicional seja falsa.
         */
        System.out.println(a == b ? "Os valores são iguais" : "Os valores são diferentes."); 


        // operadores relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; // verificando com o operador relacional de igualdade == se os números são iguais

        System.out.println("A variavel numero1 é igual a variavel numero2? " + simNao);

        simNao = numero1 != numero2; // verificando com o operador relacional de diferença != se os numeros são diferentes
        System.out.println("A variavel numero1 é diferente da variavel numero2? " + simNao);

        simNao = numero1 > numero2; // verificando com o operador relacional de maior > se a variavel numero1 é maior que a numero2
        System.out.println("A variavel numero1 é maior que a variavel numero2? " + simNao);

        simNao = numero1 < numero2; // verificando com o operador relacional de menor < se a variavel numero1 é menor que a numero2
        System.out.println("A variavel numero1 é menor que a variavel numero2? " + simNao);

        simNao = numero1 >= numero2; // verificando com o operador relacional de maior ou igual >= se a variavel numero1 é maior ou igual a numero2
        System.out.println("A variavel numero1 é maior ou igual a variavel numero2? " + simNao);

        simNao = numero1 <= numero2; // verificando com o operador relacional de menor ou igual >= se a variavel numero1 é menor ou igual a numero2
        System.out.println("A variavel numero1 é menor ou igual a variavel numero2? " + simNao);

        if(numero1 < numero2){ // usando um operador relacional em um if

            System.out.println("A nossa condição é verdadeira.");

        } 

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";

        // System.out.println(nome1 == nome2); // retornará true, porém o ideal para compararmos textos e objetos é utilizarmos o método equals
        /* se fosse do jeito que está acima, porém fosse um outro objeto na comparação, mesmo tendo o mesmo nome 
        retornaria false, pois objetos são armazenados de forma diferente */
        System.out.println(nome1.equals(nome2)); // o equals compara conteúdos

        // operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        // verificando com o operaodr lógico &&, para retornar true as duas condições precisam ser verdadeiras
        if(condicao1 && condicao2){ // reotrnará falso pois apenas uma das condições é verdadeira

            System.out.println("Verdadeiro.");

        } else {

            System.out.println("Falso.");

        }

        /*  agora utilizando o ||, que significa OU, para retornar true basta que uma das condições seja verdadeira,
         se ambas forem falsas retornará false e se as duas forem verdadeiras retornará verdadeiro também */
        if(condicao1 || condicao2){

            System.out.println("Verdadeiro.");

        } else {

            System.out.println("Falso.");

        }

    }
}
