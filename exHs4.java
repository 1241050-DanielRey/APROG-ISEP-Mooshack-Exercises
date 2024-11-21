import java.util.Scanner;

/*
Construa um programa que dado um número inteiro positivo verifica se é ou não um número primo.
Um número é primo se for inteiro e se só for divisível por ele próprio e por 1. Ou seja, que possua
exatamente dois divisores.
O resultado deve ser a mensagem "prime" ou "not prime".

Build a program that given a positive integer checks whether or not it is a prime number.
A number is prime if it is an integer greater than 1 and is only divisible, by itself and by 1.
The result should be the message "prime" or "not prime".
 */




public class exHs4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero, divisores;

        do {
            numero = ler.nextInt();
        } while (numero<=0);


        divisores = 0;
        for (int possiveldivisor=1; possiveldivisor<=numero; possiveldivisor++) {
            if (numero%possiveldivisor==0) {
                divisores += 1;
            }
        }



        if (divisores==2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }










    }
}
