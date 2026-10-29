public class BankAccount {
    String owner;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void showBalance() {
        System.out.println(owner + ": " + balance);
    }
}