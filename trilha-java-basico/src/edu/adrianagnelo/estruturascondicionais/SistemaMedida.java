package edu.adrianagnelo.estruturascondicionais;

import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {

        Scanner medidas = new Scanner(System.in);

        System.err.println("Qual a sua medida ? (P, M, G, GG) ");
        String medidaPessoal = medidas.next();

        switch (medidaPessoal) {
            case "P": {
                    System.out.println("PEQUENO");
                break;
            }
            
            case "M": {
                System.out.println("MÉDIO");
                break;
            }

            case "G": {
                System.out.println("GRANDE");
                break;
            }

            case "GG": {
                System.out.println("EXTRA GRANDE");
                break;
            }

            default:
                break;
        }
    }
}
