
public class CheckingAccount extends Account{
    private double overdraftProtection;
    
    public CheckingAccount(double initBalance, double balance, double protect){
        super(initBalance);
        super.balance = balance;
        overdraftProtection = protect;
    }
    
    public CheckingAccount(double initBalance, double balance){
        super(initBalance);
        this.balance = balance;
        overdraftProtection = -0.1d;
    }
    
    public boolean withdraw(double amt){
        super.withdraw(amt);
        double overdraftNeeded = amt - this.balance;
        if(balance - amt >= 0){
            this.balance -= amt;
            return true;
        }
        else{
            if(overdraftProtection == -1.0 || overdraftProtection < overdraftNeeded){
                return false;
            }
            else{
                this.balance = 0.0;
                overdraftProtection -= overdraftNeeded;
                return true;
            }
        }
    }
}
