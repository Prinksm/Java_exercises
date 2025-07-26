package Exercise;

import java.util.Scanner;

public class UnitConverterUpdated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Unit Converter Main Menu:");
            System.out.println("1. Convert Length");
            System.out.println("2. Convert Temperature");
            System.out.println("3. Convert Mass");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int mainOpt = scanner.nextInt();

            if (mainOpt == 4) {
                System.out.println("Exiting the Unit Converter. Goodbye!");
                break;
            }

            switch (mainOpt) {
                case 1:
                    convertLength(scanner);
                    break;
                case 2:
                    convertTemperature(scanner);
                    break;
                case 3:
                    convertMass(scanner);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void convertLength(Scanner scanner) {
        System.out.println("Convert Length:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.print("Choose an option: ");
        int opt = scanner.nextInt();

        if (opt == 1 || opt == 2) {
            System.out.print("Enter the value to convert: ");
            double value = scanner.nextDouble();
            double result = 0;

            switch (opt) {
                case 1:
                    result = value * 0.621371;
                    System.out.println(value + " kilometers is " + result + " miles.");
                    break;
                case 2:
                    result = value / 0.621371;
                    System.out.println(value + " miles is " + result + " kilometers.");
                    break;
            }
        } else {
            System.out.println("Invalid option.");
        }
    }

    private static void convertTemperature(Scanner scanner) {
        System.out.println("Convert Temperature:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int opt = scanner.nextInt();

        if (opt == 1 || opt == 2) {
            System.out.print("Enter the value to convert: ");
            double value = scanner.nextDouble();
            double result = 0;

            switch (opt) {
                case 1:
                    result = (value * 9 / 5) + 32;
                    System.out.println(value + " degrees Celsius is " + result + " degrees Fahrenheit.");
                    break;
                case 2:
                    result = (value - 32) * 5 / 9;
                    System.out.println(value + " degrees Fahrenheit is " + result + " degrees Celsius.");
                    break;
            }
        } else {
            System.out.println("Invalid option.");
        }
    }

    private static void convertMass(Scanner scanner) {
        System.out.println("Convert Mass:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose an option: ");
        int opt = scanner.nextInt();

        if (opt == 1 || opt == 2) {
            System.out.print("Enter the value to convert: ");
            double value = scanner.nextDouble();
            double result = 0;

            switch (opt) {
                case 1:
                    result = value * 2.20462;
                    System.out.println(value + " kilograms is " + result + " pounds.");
                    break;
                case 2:
                    result = value / 2.20462;
                    System.out.println(value + " pounds is " + result + " kilograms.");
                    break;
            }
        } else {
            System.out.println("Invalid option.");
        }
    }
}

