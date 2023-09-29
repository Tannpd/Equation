package common;

import java.util.Scanner;

public class Library {

    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }

    public int checkInputIntLimit(int min, int max) {
        // Loop until user input is correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a number in the range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public double checkInputDouble() {
        // Loop until user input is correct
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must input a double");
                System.out.print("Enter again: ");
            }
        }
    }

    public boolean checkOdd(double n) {
        return n % 2 == 1;
    }

    public boolean checkEven(double n) {
        return n % 2 == 0;
    }

    public boolean checkSquareNumber(double n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }
}
