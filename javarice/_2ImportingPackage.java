
import java.util.Scanner;
public class _2ImportingPackage{
    public static void main(String[] args) {
        int x;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number: ");
        x = scan.nextInt();

        System.out.println("Your number is: " + x);

        String g;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter your Name:");
        g = a.nextLine();

        System.out.println("Your name is: " + g);

        System.out.println("Your name and number is: "+g+x);

        /**
         * CHALLENGE: ONE FUNCTION CALCULATOR 
         * Create a Program that will make the user input 2 numbers and perform one of the arithmetic operators excluding increment and decrement
         */

        System.out.println("==============================================================================================================================");
    
    int  num1;
    int  num2;
    int sum;

    Scanner c =new Scanner(System.in);
    

    System.out.print("Enter number 1: ");
    num1 = c.nextInt();

    System.out.print("Enter number 2: ");
    num2 = c.nextInt();

    sum = num1 + num2;
    System.out.println(num1+" + "+ num2 +" = "+ sum);
    

    System.out.print("==============================================================================================================================");
    System.out.println("MULTIPLICATION");
/**
 * multipication
 */
int jacquelyn;
int jacklyn;
int product;



Scanner j = new Scanner(System.in);

System.out.print("Enter a number: ");
jacquelyn = j.nextInt();

System.out.print("Emter another number: ");
jacklyn = j.nextInt();

product = jacquelyn * jacklyn;

System.out.println(jacquelyn + " * " + jacklyn + " = "+ product);
}
}