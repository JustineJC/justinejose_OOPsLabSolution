import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.lang.*;
public class Employee{
   public String firstName,lastName;
    Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void generatePassword(){
        char[] stringl = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuilder random =  new StringBuilder();
        int length=11;
        for(int i =0;i<length;i++){
            int index = (int) (Math.random()*stringl.length); 
            random.append(stringl[index]);
        } System.out.println(random.toString());
    }

    public void generateEmailAddress(String department){
        System.out.println(firstName+lastName+"@"+department+".greatlearning.com");
    }

    public void showCredentials(String department,String firstName){
        System.out.println("Dear "+firstName+" your generated credentials are follows");
        System.out.println("Email ---> ");
        generateEmailAddress(department);
        generatePassword();
        

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
                obj.showCredentials("tech", "harshit");
                break;
            case 2:
                Employee obj1 =new Employee("John", "Hash");
                obj1.showCredentials("admin", "John");
                break;
            case 3:
                Employee obj2 = new Employee("Ram", "Jain");
                obj2.showCredentials("hr", "Ram");;
                break;
            case 4:
                Employee obj3 = new Employee("Srihari", "krishna"); 
                obj3.showCredentials("legal", "Srihari");
                break;
            default: 
                System.out.println("\nPlease enter a valid input:");    
            
        }
    }while(choice!=0);
}
}