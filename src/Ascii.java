import java.util.Scanner;

public class Ascii {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any value to check its ascii value");
        char n = scn.next().charAt(0);;
        int asc= (int) n;
        System.out.println("The ASCII value of " + n + " is: " + asc);
    }
}

