import java.util.Scanner;

public class Reverse_no {
    public int rev(int n){
        int rem;
        int rev = 0;
        while(n>0){
            rem = n%10;
            rev = rev *10+rem;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = scn.nextInt();
        Reverse_no obj = new Reverse_no();
        int res = obj.rev(n);
        System.out.print("Reversed number is : "+res);
    }
}
