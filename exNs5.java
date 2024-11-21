import java.util.Scanner;

/*
Construa um programa para ler um conjunto de números inteiros positivos e visualizar os que se inserem numa sequência
crescente. A leitura termina quando for inserido um número negativo.
Um número pertence a uma sequência crescente se for maior que o número anterior e os seus algarismos se apresentarem
por ordem crescente da esquerda para a direita.
Cada número deve ser visualizado numa linha separada Cada número deve aparecer numa linha separada.

Build a program to read a set of positive integers and see which ones fall into an ascending sequence.
Reading ends when a negative number is entered. A number belongs to an ascending sequence if it is greater than the
previous number and its digits are presented in ascending order from left to right.
Each number should appear on a separate line.
*/




public class exNs5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int number, tempNumber, previousNumber, currentdigit, previousDigit;
        boolean isAscending;

        number = ler.nextInt();
        previousNumber = number+1;
        while (number >= 0) {


            previousDigit = 10;
            tempNumber = number;
            isAscending = true;
            while (tempNumber>0 && isAscending) {

                currentdigit = tempNumber % 10;
                if (currentdigit < previousDigit) {

                    tempNumber /=10;
                    previousDigit = currentdigit;

                } else {
                    isAscending = false;
                }


            }

            if (isAscending && number>previousNumber) {
                System.out.println(number);
            }

            previousNumber = number;
            number = ler.nextInt();

        }



    }


}

