import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(String a){
        String rev = new StringBuilder(a).reverse().toString();
        return a.equals(rev);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter anything to check if it is palindrome or not");
        String a = scn.next();
        Palindrome obj = new Palindrome();
        if(obj.isPalindrome(a)){
            System.out.print(a+ " is a Palindrome");
        }
        else{
            System.out.print(a+ " is not a Palindrome");
        }
    }
}
