
import java.util.Scanner;
public class ImportingPackage{
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
    Scanner d =new Scanner(System.in);

    System.out.println("Enter number 1: ");
    num1 = c.nextInt();

    System.out.println("Enter number 2: ");
    num2 = d.nextInt();

    sum = num1 + num2;
    System.out.println(num1+"+"+ num2 +"="+ sum);
    }
}