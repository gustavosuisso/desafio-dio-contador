package edu.gustavo.terminaleargumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args){

      // pegando argumentos via parametros do metodo main
      //  String nome = args[0];
      // String sobrenome = args[1];
      //int idade = Integer.valueOf(args[2]);
      //double altura = Double.valueOf(args[3]);

      //  System.out.println("Olá, me chamo " + nome + " " + sobrenome);
      //  System.out.println("Eu tenho " + idade + " anos de idade.");
      //  System.out.println("E tenho " + altura + " de altura");

        // recebendo parametros via Scanner

        // instanciando um objeto do tipo Scanner e usando sua referencia para pegar entradas do teclado do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); /* como estamos usando valores decimais,
                                                                          com useLocale garantimos que usaremos a
                                                                          convensão americana */

        System.out.println("Digite seu nome");
        String nome = scanner.next(); // retorna uma string e armazena na variavel nome

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next(); // retorna uma string e armazena na variavel sobrenome

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt(); // irá converter a String passada em um int e armazenará na variavel idade

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble(); // irá converter a String passada em um double e armazenará na variavel altura

        // imprimindo os dados informados pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e " + altura + "cm de altura.");

    }

}
