import java.util.Scanner;

/* Construa um programa que dado um número inteiro positivo escreve todos os seus divisores e, no final,
a quantidade de divisores entre parêntesis.
Todos os valores devem ser escriros em linhas separadas.

Build a program that, given a positive integer, writes all of its dividers and, at the end,
the number of dividers in parentheses.
All values must be written on separate lines.
*/




public class exGs4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero,divisor,contadordedivisores;

        do {
            numero = ler.nextInt();
        }while (numero<=0);

        contadordedivisores = 0;

        for (int possiveldivisor = 1; possiveldivisor <= numero; possiveldivisor++) {
            if (numero%possiveldivisor==0) {
                divisor = possiveldivisor;
                contadordedivisores +=1;
                System.out.println(divisor);
            }
        }
        System.out.println("(" + contadordedivisores + ")");









    }
}
