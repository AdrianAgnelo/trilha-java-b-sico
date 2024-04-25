package edu.adrianagnelo.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual = " + smartTv.volume);


        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();

        System.out.println("Canal atual = " + smartTv.canal);
    }
}
