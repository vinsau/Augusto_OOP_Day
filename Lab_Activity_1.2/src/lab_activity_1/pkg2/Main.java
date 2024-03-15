package lab_activity_1.pkg2;

import java.util.Scanner;
import static lab_activity_1.pkg2.misplacedCaps.misplacedCaps;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String message = input.nextLine();

        String output = misplacedCaps(message);
        System.out.println(output);

        input.close();
    }

}
