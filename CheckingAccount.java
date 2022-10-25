
public class CheckingAccount extends Account{
    private double overdraftProtection;
    
    public CheckingAccount(double balance, double protect){
        super.balance = balance;
        overdraftProtection = protect;
    }
    
    public CheckingAccount(double balance){
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
