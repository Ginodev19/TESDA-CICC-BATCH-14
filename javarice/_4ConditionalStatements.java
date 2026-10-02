import java.util.Scanner;

public class _4ConditionalStatements {
    public static void main(String[] args) {
        
        boolean isTall = true;

        if(isTall){
            System.out.println("You are tall!");
        }
    
     int age;
     
    Scanner s = new Scanner(System.in);
     System.out.print("Enter age: ");
     age = s.nextInt();

     if(age>=18){
        System.out.println("You have access!");
     }else{
        System.out.println("You dont have access");
     }
    

     System.out.print("Enter age:");
     age = s.nextInt();

     if(age>=60){
        System.out.println("You are a senior citizen");
     }else if(age<60){
        System.out.println("Not senior");
     }else{
        System.out.println("Error");
     }
        
     }

    
    }
