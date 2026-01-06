package util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static int getInt() {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }

    public static String getString() {
        while (true) {
            String input = sc.nextLine().trim();
            if (!input.isEmpty())
                return input;
            System.out.print("Input cannot be empty: ");
        }
    }
}
