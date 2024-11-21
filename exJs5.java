import java.util.Scanner;
/*
Construa um programa que leia uma sequência de N números inteiros positivos, sendo N definido pelo utilizador.
Se o valor de N for negativo o programa termina de imediato.
O programa deve apresentar numa linha separada, para cada um dos números lidos, a percentagem dos dígitos que
são divisores do próprio número (usando 2 casas decimais). O dígito zero (0) não deve ser considerado como potencial
divisor mas deve ser contabilizado como dígito.
No final deve mostrar a maior dessas percentagens entre parêntesis.

Build a program that reads a sequence of N positive integers, where N is entered by the user.
If the value of N is negative the program terminates immediately.
The program must display on a separate line, for each of the numbers read, the percentage of digits that are
divisors of the number itself (using 2 decimal places).
The digit zero (0) should not be considered as potential divisor but should be counted as digit.
At the end, the highest of these percentages should be displayed in brackets (using 2 decimal places).
*/




public class exJs5 {
    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);

        int N, numero, digito, totalDigitos, totalDivisores, numerotemp;
        double percentDigitDivis, percentagemMaior;

        N= ler.nextInt();

        if (N>=0) {


            percentagemMaior = 0;
            for (int i=1; i<=N; i++) {

                totalDivisores = 0;
                totalDigitos = 0;

                do {
                    numero= ler.nextInt();
                } while (numero<=0);

                numerotemp=numero;

                while (numerotemp>0) {
                    digito = numerotemp%10;
                    if (digito==0) {
                        totalDigitos +=1;
                    } else if (numero%digito==0) {
                        totalDigitos +=1;
                        totalDivisores +=1;
                    } else {
                        totalDigitos +=1;
                    }
                    numerotemp=numerotemp/10;
                }

                percentDigitDivis = ((double) totalDivisores /totalDigitos)*100;
                System.out.printf("%.2f%%%n",percentDigitDivis);
                if (percentDigitDivis > percentagemMaior) {
                    percentagemMaior = percentDigitDivis;
                }
            }

            System.out.printf("(%.2f%%)", percentagemMaior);


















        }









    }
}
