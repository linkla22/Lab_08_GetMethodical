import java.util.Scanner;


public class SafeInput {


    public static boolean getYNConfirm(Scanner console, String prompt) {
        boolean retVal = false;
        String input = "";
        boolean done = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            input = console.nextLine();
            if (input.equalsIgnoreCase("y")) {

                retVal = true;
                done = true;
            } else if (input.equalsIgnoreCase("n")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("Please enter [Y/N]!");
            }

        } while (!done);

        return retVal;

    }

    public static String getRegExString(Scanner console, String prompt, String pattern) {
        String dataVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            dataVal = console.nextLine();

            if (dataVal.matches(pattern)) {
                done = true;
            }
        } while (!done);

        return dataVal;

    }

    public static int getRangedInt(Scanner console, String Prompt, int low, int high) {
        int dataVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(Prompt + " [" + low + " - " + high + "]: ");
            if (console.hasNextInt()) {
                dataVal = console.nextInt();
                console.nextLine();

                if (dataVal >= low && dataVal <= high) {
                    done = true;
                } else {
                    System.out.println("Value is out of range [" + low + " - " + high + "]: " + dataVal);
                }
            } else {
                trash = console.nextLine();
                System.out.println("You must enter a valid int " + trash);
            }
        } while (!done);

        return dataVal;
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

    public static int getInt(Scanner pipe, String prompt) {
        int input;

        System.out.print(prompt);

        while (!pipe.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            pipe.next();
            System.out.print(prompt);
        }

        input = pipe.nextInt();

        return input;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double input;

        System.out.print(prompt);

        while (!pipe.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid double value.");
            pipe.next();
            System.out.print(prompt);
        }

        input = pipe.nextDouble();

        return input;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double input;

        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");

            while (!pipe.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid double value.");
                pipe.next();
                System.out.print(prompt + "[" + low + " - " + high + "]: ");
            }

            input = pipe.nextDouble();
        } while (input < low || input > high);

        return input;
    }
}

