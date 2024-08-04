package mortgage_calculator;

import java.util.Scanner;

public class Console {
    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if ((value >= min) && (value <= max))
                break;
            System.out.println("Enter a value between " + min + " and " +max);
        }

        return value;
    }

    public static float readFloat(String prompt, double min, double max) {
        return (float) readNumber(prompt, min, max);
    }

    public static byte readByte(String prompt, double min, double max) {
        return (byte) readNumber(prompt, min, max);
    }
}
