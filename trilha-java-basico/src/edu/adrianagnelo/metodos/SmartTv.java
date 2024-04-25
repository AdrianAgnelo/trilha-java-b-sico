package edu.adrianagnelo.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 27;

    public void mudarCanal () {
        canal++;
    }

    public void aumentarVolume () {
        volume++;
    }

    public void diminuirVolume () {
        volume--;
    }

    public void ligar () {
       ligada = true;
    }

    public void desligar  () {
        ligada = false;
    }
}
