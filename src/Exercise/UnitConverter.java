package Exercise;

import java.util.Scanner;

public class UnitConverter {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Unit Converter Menu:");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Pounds to Kilograms");
            System.out.println("5. Celsius to Fahrenheit");
            System.out.println("6. Fahrenheit to Celsius");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int opt = scanner.nextInt();
            if (opt == 7) {
                System.out.println("Exiting...");
                break;
            }
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
                case 3:
                    result = value * 2.20462 ;
                    System.out.println(value + " kilograms is " + result + " pounds.");
                    break;
                case 4:
                    result = value / 2.20462 ;
                    System.out.println(value + " pounds is " + result + " kilograms.");
                    break;
                case 5:
                    result = (value * 9 / 5) + 32; ;
                    System.out.println(value + " degrees Celsius is " + result + " degrees Fahrenheit.");
                    break;
                case 6:
                    result =  (value - 32) * 5 / 9;
                    System.out.println(value + " degrees Fahrenheit is " + result + " degrees Celsius.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}
