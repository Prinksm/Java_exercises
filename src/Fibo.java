import java.util.Scanner;
public class Fibo {
    public int  fibonaci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fibonaci(n-1) + fibonaci(n-2);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any value of n");
        int n = scn.nextInt();
        if(n>=0){
            Fibo obj = new Fibo();
            int res = obj.fibonaci(n);
            System.out.println("The Fibonacci number at position " + n + " is " + res);
            System.out.println("Fibonacci Series up to " + n + " terms:");
            for (int i = 0; i <= n; i++) {
                int result = obj.fibonaci(i);
                System.out.print(result + " ");
            }
        }
        else{
            System.out.print(" write any positive number");
        }


    }
}
