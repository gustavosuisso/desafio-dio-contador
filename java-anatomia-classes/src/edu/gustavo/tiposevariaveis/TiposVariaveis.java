package edu.gustavo.tiposevariaveis;

public class TiposVariaveis {

    public static void main(String[] args){

        double salario = 2500.33; /* a forma correta de representar milhar com double é 2500, 
        por exemplo se usasse 2.500 signfiicaria dois ponto cinco e não 2500 */

        System.out.println(salario);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        /* short numeroCurto2 = numeroNormal; não conseguimos colocar um número tipado como inteiro em
         um short mesmo ele sendo um valor pequeno que normalmente o short comportaria, pois em algum momento 
         ele pode superar o limite do short. */

         // podemos realizar um casting para contornar o problema, basicamente convertemos o numeroNormal para short antes de atribuir
         short numeroCurto2 = (short) numeroNormal;

         // variaveis versus constantes
         int numero = 5;
         numero = 10; // posso mudar o valor de uma variavel a qualquer horaS

         System.out.println(numero);

         final double VALOR_DE_PI = 3.14; /* utilizando a palavra reservada final, informamos que
          esse valor não pode ser alterado, portanto é uma constante */

    }

}