package edu.adrianagnelo.estruturasderepeticoes;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");

        do{
            // Executa varias vezes até alguém atender

            System.out.println("Telefone tocando");
        }
        while(tocando());

        System.out.println("Alooô !!!");

    }

    public static boolean tocando(){
        boolean atendeu = new Random() .nextInt(3) == 1;
        System.out.println("Atendeu ? : " + atendeu);
 
        // Negando o ato de continuar tocando
        return ! atendeu;
    }
}
