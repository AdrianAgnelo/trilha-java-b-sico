package edu.adrianagnelo.estruturascondicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6;

        if (nota > 7) {
            System.err.println("Você foi aprovado com a nota : " + nota);
        } else if (nota >= 5 &&  nota < 7) {
            System.err.println("Prova de recuperação");
        } else  {
            System.err.println("Você foi reprovado com a nota : " + nota);
        }
    }
}
