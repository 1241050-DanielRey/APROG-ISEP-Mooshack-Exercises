import java.util.Scanner;

/* Palíndromo é uma palavra, frase ou número que permanece igual quando lida de trás para diante e vice versa,
 por exemplo "madam", "kayak", 1001 ou 1230321.
Construa um programa que recebe um número inteiro positivo e verifique se é ou não um palíndromo.
O resultado deve ser a mensagem "palindrome" ou "not palindrome".

A palindrome is a word, phrase, or number that remains the same when read backwards as forward, e.g.,
"madam", "kayak", 1001 or 1230321.
Build a program that receives a positive integer and check whether or not it is a palindrome.
The result should be the message "palindrome" or "not palindrome".
*/



public class exFs4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero,numero1,algarismo, numeroreverse;



        do {
            numero = ler.nextInt();
        } while (numero<=0);
        numero1=numero;
        numeroreverse = 0;

        while (numero1 > 0) {
            algarismo = numero1%10;
            numeroreverse= (numeroreverse*10)+algarismo;
            numero1= numero1/10;
        }


       if (numeroreverse == numero) {
           System.out.println("palindrome");
       } else {
           System.out.println("not palindrome");
       }

    }
}
