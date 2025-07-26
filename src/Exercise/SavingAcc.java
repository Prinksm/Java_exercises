package Exercise;

public class SavingAcc implements Account{
    double bal;
    double interest;

    public SavingAcc(double balance, double interestRate) {
        this.bal = balance;
        this.interest= interestRate;
    }

    @Override
    public double interest() {
        return bal * interest / 100;
    }

    @Override
    public double totalAmt() {
        return bal + interest;
    }

    public static void main(String[]args){
        SavingAcc obj1 = new SavingAcc(50000.00 , 8.7);
        System.out.print("Interest in SavingAcc is "+ obj1.interest());
        System.out.print("Balance in SavingAcc is "+ obj1.totalAmt());
    }
}
