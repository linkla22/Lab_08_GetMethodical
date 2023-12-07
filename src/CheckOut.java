import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0.0;

        do {
            double itemPrice = getRangedDouble(scanner, "Enter the price of your item ($0.50 - $10.00): ", 0.50, 10.00);
            totalCost += itemPrice;

        } while (getYNConfirm(scanner, "Do you have more items to purchase?"));

        System.out.printf("Total cost of items: $%.2f%n", totalCost);

        scanner.close();
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
}
