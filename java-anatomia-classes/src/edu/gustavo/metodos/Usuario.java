package edu.gustavo.metodos;

public class Usuario {
    
    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.escolherCanal(70);

        System.out.println(smartTv.statusSmartTv());

    }

}
