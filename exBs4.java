import java.util.Scanner;

/*
Construa um programa que calcule a soma dos algarismos pares de um número inteiro positivo introduzido pelo
utilizador. Por exemplo, se a entrada for o número 36781 a saída será 14 (8+6)
O algoritmo deve ser aplicado a uma sequência de números inteiros terminada por um número não positivo.

Build a program that calculates the sum of the even digits of a positive integer entered by the user.
For example, if the input is number 36781 the output will be 14 (8 + 6).
The algorithm must be applied to a sequence of integers terminated by a non-positive number.
*/




public class exBs4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero, soma, algarismo;

        numero = ler.nextInt();

        while (numero>0) {
            soma= 0;
            while (numero>0) {
                algarismo = numero % 10;
                if (algarismo % 2 == 0) {
                    soma = soma + algarismo;
                }
                numero = numero / 10;
            }
            System.out.println(soma);
            numero= ler.nextInt();
        }
    }
}
