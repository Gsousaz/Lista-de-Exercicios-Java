package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        int numeroDigitado = lerNumero();
        String oddTest = ehPar(numeroDigitado) ? "par" : "ímpar";
        String negativeTest = ehPositivo(numeroDigitado) ? "positivo" : "negativo";
        System.out.printf("%s é %s e %s%n", numeroDigitado, oddTest, negativeTest);
    }

    public static int lerNumero () {
        Scanner userImput = new Scanner(System.in);
        System.out.println("Escolha um número!");
        int numero = userImput.nextInt();
        return numero;
    }

    public static boolean ehPar (int numero){
        return numero % 2 == 0;
    }

    public static boolean ehPositivo (int numero) {
        return numero > 0;
    }
}

