package Exercicios;

//Escreva um código que deve imprimir a tabela de multiplicação de algum número fornecido além de exibir um cabeçalho com o nome Tabela de multiplicação de X,
// onde X é o número a ser multiplicado.

// Exemplo de saída
//Tabela de multiplicação por 5
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//        5 x 4 = 20
//        5 x 5 = 25
//        5 x 6 = 30
//        5 x 7 = 35
//        5 x 8 = 40
//        5 x 9 = 45
//        5 x 10 = 50

import java.util.Scanner;

public class Exercicio_03 {
    public static void main (String[] args){
        int multiplier = returnUserImput();
        System.out.println(returnHeader(multiplier));
        formattedResponse(multiplier);

    }

    public static int returnUserImput() {
        Scanner userImput = new Scanner(System.in);
        System.out.println("Insira um número para multiplicar.");
        return userImput.nextInt();
    }

    public static String returnHeader(int userImput) {
        return "Tabela de multiplicação por " + userImput;
    }

    public static void formattedResponse(int multiplier) {
        for (int i = 1; i < 11; i++){
            System.out.println(multiplier + " x " + i + " = " + (i*multiplier));
        }
    }

}
