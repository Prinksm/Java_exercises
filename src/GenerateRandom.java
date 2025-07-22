import java.util.Scanner;

public class GenerateRandom {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any value of range i.e. min and max");
        int min = scn.nextInt();
        int max = scn.nextInt();
        System.out.println("Random value of type int between "+min+" to "+max+ ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
