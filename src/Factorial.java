import java.util.Scanner;

public class Factorial {
    public int fact(int n ){
        if(n==0||n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any value of n");
        int n = scn.nextInt();
        Factorial obj = new Factorial();
        int res = obj.fact(n);
        System.out.println("Factorial of n is : " + res);
    }
}
