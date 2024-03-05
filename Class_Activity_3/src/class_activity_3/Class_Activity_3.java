package class_activity_3;

import java.util.Scanner;

public class Class_Activity_3 {

    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private boolean isMinor;

        public Student(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.isMinor = (age < 18);
        }

        public String getName() {
            return lastName + ", " + firstName;
        }

        public void increaseAge() {
            age++;
            isMinor = (age < 18);
        }

        @Override
        public String toString() {
            String status = isMinor ? "minor" : "adult";
            return lastName + ", " + firstName + " - " + age + " - " + status;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter test case number: ");
            int testCase = scanner.nextInt();

            switch (testCase) {
                case 1 -> {
                    Student student1 = new Student("Jemar Jude", "Maranga", 17);
                    System.out.println("Test Case 1: Student under 18");
                    System.out.println(student1);
                    break;
                }
                case 2 -> {
                    Student student2 = new Student("Jemar Jude", "Maranga", 17);
                    student2.increaseAge();
                    System.out.println("Test Case 2: Increase age of student1");
                    System.out.println(student2);
                    break;
                }
                case 3 -> {
                    Student student3 = new Student("Jose", "Cruz", 19);
                    System.out.println("Test Case 3: Student over 18");
                    System.out.println(student3);
                    break;
                }
                default -> {
                    System.out.println("Invalid test case number.");
                    break;
                }
            }
            scanner.close();
        }
    }
}
