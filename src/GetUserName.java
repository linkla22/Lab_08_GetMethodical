import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLengthString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLengthString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }

    public static String getNonZeroLengthString(Scanner console, String prompt) {
    String dataVal = "";

    do {
        System.out.print(prompt);
        dataVal = console.nextLine();
        if (dataVal.length() == 0) ;
        {
            System.out.println("You must enter Something!");
        }
    } while (dataVal.length() == 0);

    return dataVal;
}

}
