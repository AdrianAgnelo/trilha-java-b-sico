package edu.adrianagnelo.estruturasderepeticoes;

public class Teste {
    public static void main(String[] args) {
        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
    }
}
