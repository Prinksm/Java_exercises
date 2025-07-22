import java.util.Scanner;
public class Atm {
    public static void main(String args[] ) {
        int bal = 15000;
        int withdraw;
        int deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    if (bal >= withdraw) {
                        bal = bal - withdraw;
                        System.out.println("Withdrawl successful");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    bal = bal + deposit;
                    System.out.println("deposited successfully");
                    break;
                case 3:
                    System.out.println("Balance : " + bal);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
