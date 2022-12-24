package prectis;

import java.util.*;

// discrpstion:
// guess a number 

//  IMPOTR JAVA.UTIS for colect an input from youer:
//  mack one variable TYPE = "double", NAME OF Variable is "num":
//  in variable we use a Math function 
//      1. Is a Math.floor ( for any float number transfor integer  number )
//      2. we are use another Math function is Math.random()*101 (math.random() provide random number amd *101 meaning (1 to 100 any )

public class pro2_guess_num

{

    public static void main(String[] a) {

        Scanner guess = new Scanner(System.in);

        double num = Math.floor(Math.random() * 101);
        // System.out.println(num);
        System.out.println("YOU heve 11 chance");

        for (int i = 1; i < 12; i++) // given chance for guess :

        {
            System.out.println(" Yuor chense noin 01 TO 100   : " + i);

            System.out.println(" Enter Your guess Number: ");

            int num1 = guess.nextInt();

            if (num == num1) // ceck a math.random or user number are match or not :
            {

                System.out.println(" Your guess is trua " + " " + num);

                break;
            }

            else if (num < num1) {

                System.out.println(" Your guess is less then guess number  :" + " " + num1);

            } else if (num > num1) {

                System.out.println(" Your guess is greater then guess number:" + " " + num1);

            } else {

                System.out.println(" Your guess wrong sorry try agen");
            }
        }
    }

}
