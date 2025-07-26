package Exercise;

public class CurrentAcc implements Account {
    private double bal;
    private double serviceCharge;

    public CurrentAcc(double balance, double serviceCharge) {
        this.bal = balance;
        this.serviceCharge = serviceCharge;
    }
    @Override
    public double interest() {
        return 0;
    }

    @Override
    public double totalAmt() {
        return bal - serviceCharge;
    }

    public static void main(String[]args){
        CurrentAcc obj1 = new CurrentAcc(50000.00 , 870.00);
        System.out.println("Interest in SavingAcc is "+ obj1.interest());
        System.out.print("Balance in SavingAcc is "+ obj1.totalAmt());
    }
}
