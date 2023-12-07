import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = getRegExString(scanner, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + ssn);
        String mNumber = getRegExString(scanner, "Enter your UC Student M number (M######)", "^(M|m)\\d{5}$");
        System.out.println("Your UC Student M number: " + mNumber);
        String menuChoice = getRegExString(scanner, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Your menu choice: " + menuChoice);

        scanner.close();
    }

    public static String getRegExString(Scanner console, String prompt, String pattern) {
        String dataVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            dataVal = console.nextLine();

            if (dataVal.matches(pattern)) {
                done = true;
            } else {
                System.out.println("Invalid input. Please follow the specified pattern.");
            }
        } while (!done);

        return dataVal;
    }
}
