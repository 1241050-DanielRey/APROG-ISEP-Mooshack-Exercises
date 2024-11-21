import java.util.Scanner;

/*
Uma Pizzaria possui uma variedade de Pizzas no seu menu. A variedade das Pizzas surge da diferente utilização de 10
ingredientes possíveis. Cada ingrediente é identificado por um algarismo de 0 a 9. Desta forma, cada Pizza é identificada
por um número inteiro cujos algarismos correspondem aos ingredientes que a compõem. Por exemplo, a Pizza 6501 contém os
ingredientes 0,1,5 e 6. No momento do pedido, o cliente declara os ingredientes de que não gosta ou a que é alérgico e a
Pizzaria apenas sugere, de entre as Pizzas disponíveis do menu, aquelas que não contêm qualquer um desses ingredientes.

Entrada:
Um número inteiro representando os ingredientes que o cliente não gosta ou é alérgico.
De seguida, é introduzido o número de Pizzas (N) existentes no menu.
Finalmente, são introduzidos N números inteiros referentes às N Pizzas do menu (descrição dos ingredientes).

Saída:
Mostrar em linhas separadas cada Pizza que satisfaça as pretensões do cliente (que não contenha qualquer ingrediente de que ele não gosta ou é alérgico), no seguinte formato:
Suggestion #<i>:<pizza>
Em que <i> é a ordem da sequência da sugestão e <pizza> é o código da pizza.



A Pizza restaurant has a variety of Pizzas on its menu. The variety of Pizzas results from the different use of 10
possible ingredients. Each ingredient is identified by a number from 0 to 9.In this way, each Pizza is identified by an
integer whose digits correspond to the ingredients that compose it. For example, Pizza 6501 contains ingredients 0, 1, 5
and 6.When ordering, the customer declares the ingredients that he does not like or is allergic to, and the restaurant
only suggests, among the Pizzas available on the menu, those that do not contain any of these ingredients.

Input:
An integer representing ingredients that the customer does not like or is allergic to.
Then, the number of Pizzas (N) in the menu is entered.
Finally, N integers are introduced referring to the N Pizzas in the menu (description of the ingredients of each Pizza).

Output:
Show on separate lines each Pizza that satisfies the customer's requirements (which does not contain any ingredient that the customer does not like or is allergic to), in the following format:
Suggestion #<i>:<pizza>
Where <i> is the order of the suggestion sequence and <pizza> is the pizza code.
*/




public class exOs5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int allergies, tempAllergies, pizzasNumber, pizzaInMenu, tempPizzaInMenu, digitAllergies, digitPizzasInMenu,uselessVariable, suggestionCounter;
        boolean allergyPresent = false;

        allergies = ler.nextInt();
        pizzasNumber = ler.nextInt();
        suggestionCounter = 0;
        for (int i=1; i<=pizzasNumber; i++) {
            pizzaInMenu = ler.nextInt();
            tempPizzaInMenu = pizzaInMenu;

            while (tempPizzaInMenu>0) {
                tempAllergies = allergies;
                digitPizzasInMenu = tempPizzaInMenu%10;
                if (allergies != 0) {
                    while (tempAllergies > 0) {

                        digitAllergies = tempAllergies % 10;
                        allergyPresent = false;
                        if (digitAllergies == digitPizzasInMenu) {
                            allergyPresent = true;
                            tempAllergies = 0;
                            tempPizzaInMenu = 0;
                        } else {
                            tempAllergies /= 10;
                        }

                    }
                    tempPizzaInMenu /= 10;


                } else if (allergies==digitPizzasInMenu) {
                    tempPizzaInMenu=0;
                    allergyPresent = true;
                } else  {
                    tempPizzaInMenu /=10;
                    allergyPresent = false;
                }
            }
            if (allergyPresent) {
                uselessVariable= 69;
            } else {
                suggestionCounter +=1;
                System.out.println("Suggestion #" + suggestionCounter + ":" + pizzaInMenu);
            }
        }





    }
}
