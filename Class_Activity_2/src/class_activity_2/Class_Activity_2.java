
package class_activity_2;

import java.util.Scanner;

public class Class_Activity_2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String message = input.nextLine();
        
        String output = misplacedCaps(message);
        System.out.println(output);
        
        input.close();
    }
    
    public static String misplacedCaps(String message) 
    {
        StringBuilder result = new StringBuilder();
        boolean foundMisplacedCaps = false;
        
        for (int i = 0; i < message.length(); i++) 
        {
            char currentChar = message.charAt(i);
            
            if (Character.isUpperCase(currentChar)) 
            {
                if (i == 0 || !Character.isAlphabetic(message.charAt(i - 1))) 
                {
                    continue;
                } 
                else 
                {
                    foundMisplacedCaps = true;
                    break;
                }
            }
        }
        
        if (foundMisplacedCaps) 
        {
            result.append("JEJE!");
        } 
        else 
        {
            result.append("uWu");
        }
        
        return result.toString();
    }
}
