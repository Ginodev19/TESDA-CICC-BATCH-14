/**Declaring 
 * w/ Values
 */
import java.util.Scanner;
public class _3Arrays {
    public static void main(String[] args) {
        String studentNames[] = {
            "Sora",
            "Callie",
            "Gino",
            "Jacquelyn"
        };
        System.out.println(studentNames[3]);

/*----------------------------------------------------------------- */
        int numbers[]={1,2,3,4,5,6,7,8};
        System.out.println(numbers[2]+ numbers[5]);

        numbers[0] = 24;


        System.out.println(numbers[0]);

/*----------------------------------------------------------------- */

Scanner a = new Scanner(System.in);

String names[] = new String[3];

System.out.print("Provide 3 names: ");
names[0] = a.nextLine();

System.out.print("Provide 3 names: ");
names[1] = a.nextLine();

System.out.print("Provide 3 names: ");
names[2] = a.nextLine();

System.out.println(names[0]);
System.out.println(names[1]);
System.out.println(names[2]);




/*W/o Values */

      String pusa[] = new String[10];



/*CHALLENGE: PAIRED BY ARRAY INDEX
Create 3 arrays that will hold 5 user's credentials: 
Email, Username, Password*/



String credentials[] = new String[5];

Scanner c = new Scanner(System.in);

System.out.print("Enter Email: ");
credentials[0] = c.nextLine();

System.out.print("Enter Username: ");
credentials[1] = c.nextLine();

System.out.print("Enter Age: ");
credentials[2] = c.nextLine();

System.out.print("Enter Gender: ");
credentials[3] = c.nextLine();

System.out.print("Enter Password: ");
credentials[4] = c.nextLine();

System.out.println("Your email is "+ credentials[0]);
System.out.println("Your username is "+ credentials[1]);
System.out.println("Your Age is: "+ credentials[2]);
System.out.println("Your Gender is: "+credentials[3]);
System.out.println("Your password is: "+ credentials[4]);

    


/*Wrong up */

String email[] = new String[5];
String username[] = new String[5];
String password[] = new String[5];

Scanner z = new Scanner(System.in);

System.out.println("Person 1: ");
System.out.print("Enter email ");
email[0] = z.nextLine();

System.out.print("Enter Username: ");
username[0] = z.nextLine();

System.out.println("Enter Password; ");
password[0] = z.nextLine();


System.out.println("Person 2: ");
System.out.print("Enter email ");
email[1] = z.nextLine();

System.out.print("Enter Username: ");
username[1] = z.nextLine();

System.out.println("Enter Password; ");
password[1] = z.nextLine();

System.out.println("Person 3: ");
System.out.print("Enter email ");
email[2] = z.nextLine();

System.out.print("Enter Username: ");
username[2] = z.nextLine();

System.out.println("Enter Password; ");
password[2] = z.nextLine();


System.out.println("Person 4: ");
System.out.print("Enter email ");
email[3] = z.nextLine();

System.out.print("Enter Username: ");
username[3] = z.nextLine();

System.out.println("Enter Password; ");
password[3] = z.nextLine();



System.out.println("Person 5: ");
System.out.print("Enter email ");
email[4] = z.nextLine();

System.out.print("Enter Username: ");
username[4] = z.nextLine();

System.out.println("Enter Password; ");
password[4] = z.nextLine();




System.out.println("Person 1: \n email"+email[0]+ "\n username:"+ username[0]+"\n password:"+ password[0]);
System.out.println("Person 2: \n email"+email[1]+ "\n username:"+ username[1]+"\n password:"+ password[1]);
System.out.println("Person 3: \n email"+email[2]+ "\n username:"+ username[2]+"\n password:"+ password[2]);
System.out.println("Person 4: \n email"+email[3]+ "\n username:"+ username[3]+"\n password:"+ password[3]);
System.out.println("Person 5: \n email"+email[4]+ "\n username:"+ username[4]+"\n password:"+ password[4]);
    }
}
