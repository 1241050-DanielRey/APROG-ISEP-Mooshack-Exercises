import java.util.Scanner;

/*
Construa um programa que dados dois números inteiros positivos calcula o mínimo múltiplo comum (MMC).
O MMC de dois números é o menor número positivo múltiplo desses dois números.

Build a program that given two positive integers calculates the least common multiple (LCM).
The LCM of 2 numbers is the smallest positive number that is a multiple of these two numbers.
*/



public class exIs4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero1, numero2, dividendo, mmc, mdc, resto, divisor;
        // "mmc" é o mínimo múltiplo comum, o "mdc" é máximo divisor comum//




        do {
            numero1= ler.nextInt();
            numero2= ler.nextInt();
        }while (numero1<=0 || numero2<=0);


        dividendo=numero1;
        divisor= numero2;
        resto= 0;



        do {
            mdc=resto;
            resto = dividendo % divisor;
            dividendo = divisor;
            divisor=resto;
        } while (resto>0);


        if (mdc != 0) {
            mmc = (numero1 * numero2) / mdc;
        }else {
            mmc = Math.max (numero1, numero2);
        }


        System.out.println(mmc);























    }
}
