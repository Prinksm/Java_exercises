import java.util.Scanner;

public class Prime_no {
    public boolean prime(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i =2 ;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any value of n up to which you want to check for prime numbers.");
        int n = scn.nextInt();
        Prime_no obj = new Prime_no();
        for(int i =0;i<=n;i++){
            if(obj.prime(i)){
                System.out.print(i +" ");
            }
        }
    }
}
