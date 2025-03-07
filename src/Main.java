import java.util.Scanner;

//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar,
//positivo ou negativo.
// Exemplos de Saída
//-5 é ímpar e negativo.
//10 é par e positivo.

    public class Main {
        public static void main(String[] args) {
            int numeroDigitado = lerNumero();
            String oddTest = ehPar(numeroDigitado) ? "par" : "ímpar";
            String negativeTest = ehPositivo(numeroDigitado) ? "positivo" : "negativo";
            System.out.println(String.format("%s é %s e %s", numeroDigitado, oddTest, negativeTest));
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