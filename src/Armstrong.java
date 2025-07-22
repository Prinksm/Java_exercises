import java.util.Scanner;

public class Armstrong {
    public boolean arms(int n){
        int temp = n;
        int  digits = 0;
        int rem = 0;
        int sum = 0;
        while(temp>0){
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0){
            rem = temp%10;
            sum += (Math.pow(rem, digits));
            temp = temp/10;
        }
        if(n==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any value to check if it is Armstrong number");
        int n = scn.nextInt();
        Armstrong obj = new Armstrong();
        if(obj.arms(n)){
            System.out.print(n+ " is a Armstrong Number");
        }else {
            System.out.print(n + " is not a Armstrong Number");
        }
    }
}
