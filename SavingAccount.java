
public class SavingAccount extends Account {
    private double interestRate;
    
    public SavingAccount(double initBalance, double balance, double interest_rate){
        super(initBalance);
        super.balance = balance;
        this.interestRate = interest_rate;
    }
}
