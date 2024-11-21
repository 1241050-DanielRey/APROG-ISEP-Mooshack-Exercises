import java.util.Scanner;

/*
Construa um programa que determine e visualize os números primos até um determinado valor N inserido pelo utilizador.
Um número é primo se for inteiro, maior que 1 e se só for divisível, por ele próprio e por 1.
Cada número deve aparecer numa linha separada.

Build a program that determines and displays prime numbers up to a certain N value entered by the user.
A number is prime if it is integer, greater than 1, and only divisible, by itself and by 1.
Each number must appear on a separate line.
*/



public class exKs5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int N, divisor;
        int CONSTANTE = 3;

        N = ler.nextInt();

        for (int possiblePrime=2; possiblePrime<=N; possiblePrime++) {

            divisor = 0;

            for (int possibleDivisor=1; possibleDivisor<=possiblePrime; possibleDivisor++) {

                if (possiblePrime%possibleDivisor==0) {
                    divisor +=1;
                }

            }
            if (divisor==2) {
                System.out.println(possiblePrime);
            }
        }










    }
}
