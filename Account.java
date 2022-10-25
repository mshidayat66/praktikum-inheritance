
public class Account {
    protected double balance;
    
    public Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance() {
        return this.balance;
    }
    
    public boolean deposit(double amt){
        balance += amt;
        return true;
    }
    
    public boolean withdraw(double amt){
        balance -= amt;
        return true;
    }
}
