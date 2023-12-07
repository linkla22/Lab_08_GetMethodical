import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favoriteInt = getInt(scanner, "Enter your favorite integer: ");
        System.out.println("Your favorite integer is: " + favoriteInt);

        double favoriteDouble = getDouble(scanner, "Enter your favorite double: ");
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
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
}

