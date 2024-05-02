package edu.adrianagnelo.fluxosdeexcecoes;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCatch {
    public static void main(String[] args) {
        try{
            
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome : ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome : ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade : ");
        int idade = scanner.nextInt();
       
        System.out.println("Digite sua altura : ");
        double altura = scanner.nextDouble();


        System.out.println("Meu nome é " + nome + " " + sobreNome + " tenho " + idade + " anos e " + altura + " de altura.A");

        scanner.close();
    } 
    catch (InputMismatchException e) {
        System.err.println("Os campos idade e altura precisam ser númericos");
    }
}
}
