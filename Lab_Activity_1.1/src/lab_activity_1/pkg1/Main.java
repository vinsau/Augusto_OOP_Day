package lab_activity_1.pkg1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your Full Name(Last name, first name): ");
        String fullName = scanner.nextLine();

        System.out.print("Input your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input your Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Input your Address: ");
        String address = scanner.nextLine();

        System.out.print("Input your Civil Status: ");
        String civilStatus = scanner.nextLine();

        System.out.print("Input the number of sibling you have: ");
        int numberOfSiblings = scanner.nextInt();

        scanner.close();

        System.out.println("\n\nName: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Civil Status: " + civilStatus);
        System.out.println("Number of siblings: " + numberOfSiblings);
    }
}
