package edu.gustavo.switchcase;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeMedida {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String sigla;
        System.out.println("Digite uma sigla: P, M ou G");
        sigla = scanner.next();

        // exercicitando switch case
        // colocamos a variavel a ser analisade entre os parenteses da palavra reservada switch
        switch (sigla) {

            case "P": { // colocamos a palavra reservada case e o valor condicional, "caso o valor seja P"

                System.out.println("Essa sigla significa PEQUENO.");
                break;

            }

            case "M": {

                System.out.println("Essa sigla significa MEDIO.");
                break;

            }

            case "G": {

                System.out.println("Essa sigla significa GRANDE.");
                break;
            }

            default: {

                System.out.println("Valor indefinido.");

            }
        }

    }

}
