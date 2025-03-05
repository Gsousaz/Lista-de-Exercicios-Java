import java.util.Scanner;

//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar,
//positivo ou negativo.
    public class Main {
        public static void main(String[] args) {
            System.out.println(ehPar(3));
        }

        public static boolean ehPar (int numero){
            return numero % 2 == 0;
        }
    }