package edu.gustavo.metodos;

// exercicio para criação de uma classe que representará uma SmartTV que terá alguns métodos

public class SmartTv {

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 30;

    public void ligar(){

        this.ligada = true;

    }

    public void desligar(){

        this.ligada = false;

    }

    public void aumentarCanal(){ 

        this.canal += 1;

    }

    public void diminuirCanal(){ /* de primeira eu tinha criado um método passar canal que só aumentava, 
                                    mas lembrei que o usuário poderia voltar com o canal */

        this.canal -= 1;

    }

    public void escolherCanal(int numero){

        this.canal = numero;

    }
    
    public void aumentarVolume(){

        this.volume += 1;

    }

    public void diminuirVolume(){

        this.canal -= 1;

    }

    public String statusSmartTv(){

        return "A TV está ligada: " + this.ligada + " | Canal: " + this.canal + " | Volume: " + this.volume;

    }
}
