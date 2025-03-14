package Exercicios;

import java.util.Arrays;
import java.util.Scanner;


// Dado um número inteiro x, imprima uma sequência de Fibonacci de tamanho x.
// Exemplo de saída para uma sequência de tamanho 5
// 0 1 1 2 3

// Exemplo de saída para uma sequência de tamanho 10
// 0 1 1 2 3 5 8 13 21 34

// Exemplo de saída para uma sequência de tamanho 20
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181


public class Exercicio_02 {
    public static void main (String[] args) {
        int userImput = returnUserImput();
        int[] fibonacci = new int[userImput];//Cria um array do tamanho especificado pelo user
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < userImput; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(Arrays.toString(fibonacci));
    }

    public static int returnUserImput(){
        Scanner UserImput = new Scanner(System.in);
        System.out.println("Insira o tamanho da sequencia");
        return UserImput.nextInt();
    }
}
