import java.util.Scanner;

/* Construa um programa que recebe um número inteiro na base 8 e converte-o para o sistema decimal.
O algoritmo deve ser aplicado a uma sequência de números inteiros terminada por um número não positivo.
Cada resultado deve ser visualizado em linhas separadas.

Build a program that takes an integer in base 8 and converts it to the decimal system.
The algorithm must be applied to a sequence of integers ending with a non-positive number.
Each result should be displayed on a separate line.
*/




public class exEs4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numerooctal, algarismo, result;
        double position, numeroDecimal;


        numerooctal = ler.nextInt();

        while (numerooctal>0) {
            numeroDecimal = 0.0;
            position = -1.0;

            do {
                algarismo = numerooctal % 10;
                position += 1;
                numeroDecimal = numeroDecimal + (algarismo * Math.pow(8, position));
                numerooctal = numerooctal / 10;

            } while (numerooctal > 0);
         result = (int) numeroDecimal;
            System.out.println(result);
            numerooctal = ler.nextInt();

        }



    }





}




