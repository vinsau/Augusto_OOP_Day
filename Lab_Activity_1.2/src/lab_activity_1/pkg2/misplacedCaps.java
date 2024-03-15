package lab_activity_1.pkg2;

public class misplacedCaps {

    public static String misplacedCaps(String message) {
        StringBuilder result = new StringBuilder();
        boolean foundMisplacedCaps = false;

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                if (i == 0 || !Character.isAlphabetic(message.charAt(i - 1))) {
                    continue;
                } else {
                    foundMisplacedCaps = true;
                    break;
                }
            }
        }

        if (foundMisplacedCaps) {
            result.append("JEJE!");
        } else {
            result.append("uWu");
        }

        return result.toString();
    }

}
