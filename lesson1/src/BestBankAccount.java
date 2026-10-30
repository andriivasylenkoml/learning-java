public class BestBankAccount {
    private double balance;
    public double getBalace(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }

    }
}
