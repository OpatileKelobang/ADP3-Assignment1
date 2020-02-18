package za.ac.cput;

import java.util.Scanner;

public class App
{

    static Scanner console = new Scanner(System.in);
    public static void main( String[] args )

    {
        int num1, num2;
        int sum;
        String name;

        System.out.println( "===========================================");
        System.out.println( "        S U M  C A L C U L A T O R         ");
        System.out.println( "===========================================");

        //User input
        System.out.print("Name? ")
        name = console.nextLine();
        System.out.ptintln("Hello " + name + "!")
            
        System.out.print( "Please enter a value for num1: " );
        num1 = console.nextInt();

        System.out.print( "Please enter a value for num2: " );
        num2 = console.nextInt();

        //processing
        sum = num1 + num2;

        //output
        System.out.println("Sum is: " + sum + ". " + "Have a nice day " + name);
    }
}
