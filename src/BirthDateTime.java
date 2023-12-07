import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = getRangedInt(scanner, "Enter the year of birth (1950-2015): ", 1950, 2015);
        int birthMonth = getRangedInt(scanner, "Enter the month of birth (1-12): ", 1, 12);
        int maxDays;
        switch (birthMonth) {
            case 2:
                maxDays = 29;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }

        int birthDay = getRangedInt(scanner, "Enter the day of birth (1-" + maxDays + "): ", 1, maxDays);
        int birthHours = getRangedInt(scanner, "Enter the hour of birth (1-24): ", 1, 24);
        int birthMinutes = getRangedInt(scanner, "Enter the minute of birth (1-59): ", 1, 59);

        System.out.println("Birth Date and Time: " + birthMonth + "/" + birthDay + "/" + birthYear +
                " " + String.format("%02d:%02d", birthHours, birthMinutes));

        scanner.close();
    }

    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int dataVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
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
}
