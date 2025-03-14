package Exercicios;

import java.util.Scanner;


//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar,
//positivo ou negativo.
// Exemplos de Saída:
//-5 é ímpar e negativo.
//10 é par e positivo.


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
        return userImput.nextInt();
    }

    public static boolean ehPar (int numero){
        return numero % 2 == 0;
    }

    public static boolean ehPositivo (int numero) {
        return numero > 0;
    }
}

