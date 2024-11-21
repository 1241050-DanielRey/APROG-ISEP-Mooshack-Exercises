import java.util.Scanner;

/*
Construa um programa para mostrar os N primeiros termos da sucessão de Fibonacci.
Nesta sucessão, o primeiro termo é zero (0), o segundo termo é um (1) e qualquer um dos outros termos é igual à
soma dos dois termos anteriores.
Cada número deve aparecer numa linha separada.

Build a program to display the first N terms of Fibonacci's succession.
In this sequence, the first term is zero (0), the second term is one (1), and any of the other terms is equal to
the sum of its previous two terms.
Each number should appear on a separate line.
*/



public class exMs5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int N, term, lastTerm, lastTerm2;
        int FIRSTTERM=0, SECONDTERM=1;


        N = ler.nextInt();

        if (N==1) {
            System.out.println(FIRSTTERM);
        } else if (N==2) {
            System.out.println(FIRSTTERM);
            System.out.println(SECONDTERM);
        } else if(N!=0) {

            System.out.println(FIRSTTERM);
            System.out.println(SECONDTERM);

            lastTerm2 = FIRSTTERM;
            lastTerm = SECONDTERM;

            for (int i = 3; i <= N; i++) {
                term = lastTerm + lastTerm2;
                System.out.println(term);
                lastTerm2 = lastTerm;
                lastTerm = term;
            }


        }
    }
}

