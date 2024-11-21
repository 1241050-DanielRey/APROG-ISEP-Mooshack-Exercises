import java.util.Scanner;

/* Construa um programa que calcule o produto dos algarismos ímpares de um número inteiro positivo introduzido
pelo utilizador. Por exemplo, se a entrada for o número 56983 a saída será 135 (3*9*5).
Se o número não contiver algarismos impares deve ser visualizada a mensagem "no odd digits".
O algoritmo deve ser aplicado a uma sequência de números inteiros terminada por um número não positivo.
Cada resultado deve ser visualizado em linhas separadas.

Build a program that calculates the product of odd digits of a positive integer entered by the user.
For example, if the input is number 56983 the output will be 135 (3 * 9 * 5).
If there are no odd digits, it should be displayed the message "no odd digits".
The algorithm must be applied to a sequence of integers ending with a non-positive number.
Each result should be displayed in separate line.
*/


public class exDs4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero, algarismo, produto, contador;

        numero = ler.nextInt();

        while (numero>0) {

            contador= 0;
            produto= 1;
            while (numero > 0) {
                algarismo = numero % 10;
                if (algarismo % 2 != 0) {
                    contador += 1;
                    produto = produto * algarismo;
                }
                numero = numero / 10;
            }
            if (contador == 0) {
                System.out.println("no odd digits");
            } else {
                System.out.println(produto);
            }
            numero = ler.nextInt();
        }










    }
}
