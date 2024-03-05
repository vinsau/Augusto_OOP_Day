
package class_activity_1;

import java.util.Scanner;

public class Class_Activity_1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input your Full Name(Last name, first name): ");
        String fullName = input.nextLine();
        
        System.out.print("Input your Age: ");
        int age = input.nextInt();
        input.nextLine();
        
        System.out.print("Input your Gender: ");
        String gender = input.nextLine();
        
        System.out.print("Input your Address: ");
        String address = input.nextLine();
        
        System.out.print("Input your Civil Status: ");
        String civilStatus = input.nextLine();
        
        System.out.print("Input the number of sibling(s) you have: ");
        int numberOfSiblings = input.nextInt();
        
        input.close();
        
        System.out.println("\n\nName: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Civil Status: " + civilStatus);
        System.out.println("Number of siblings: " + numberOfSiblings);
    }
}
