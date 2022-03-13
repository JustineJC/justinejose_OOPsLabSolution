import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.lang.Runtime.*;
public class Employee{
   public String firstName,lastName;
    Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void generatePassword(){
        String a = "abcdefghijklmnopqrst";
        System.out.println(Random(a)); 
    }

    public void generateEmailAddress(String department){
        System.out.println(firstName+lastName+"@"+department+".greatlearning.com");
    }

    public void showCredentials(){
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int choice;
    do{
        System.out.println("1. Techinical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        switch(choice){
            case 0:
                 choice=0;
                break;
            case 1:
                Employee obj = new Employee("harshit","choudary");
                obj.generateEmailAddress("Technical");
                break;
            case 2:
                Employee obj1 =new Employee("John", "Hash");
                obj1.generateEmailAddress("Admin");
                break;
            case 3:
                Employee obj2 = new Employee("Ram", "Jain");
                obj2.generateEmailAddress("hr");
                break;
            case 4:
                Employee obj3 = new Employee("Srihari", "krishna"); 
                obj3.generateEmailAddress("Legal");
                break;
            default: 
                System.out.println("\nPlease enter a valid input:");    
            
        }
    }while(choice!=0);
}
}