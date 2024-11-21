import java.util.Scanner;

/*
Construa um programa que determine e visualize os N primeiros números perfeitos.
Um número é perfeito se for natural e for igual à soma de todos os seus divisores (excluindo o próprio número).
Cada número deve aparecer numa linha separada.

Build a program that determines and visualizes the first N perfect numbers.
A number is perfect if it is natural and equals to the sum of all its divisors (excluding the number itself).
Each number should appear on a separate line.
*/




public class exLs5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int N, perfectNumberCounter, somaDivisores;


        N = ler.nextInt();

        perfectNumberCounter = 1;

        for (int possiblePerfect=2; perfectNumberCounter<=N; possiblePerfect++) {
            somaDivisores= 0;

            for (int possibledivisor=1; possibledivisor<possiblePerfect; possibledivisor++) {

                if (possiblePerfect%possibledivisor==0) {
                    somaDivisores += possibledivisor;
                }

            }
            if (somaDivisores==possiblePerfect) {
                perfectNumberCounter++;
                System.out.println(possiblePerfect);
            }







        }





    }
}
