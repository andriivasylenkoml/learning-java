public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        BankAccount account1 = new BankAccount();
        account1.owner = "Andrii";
        account1.balance = 100;

        BankAccount account2 = new BankAccount();
        account2.owner = "Maria";
        account2.balance = 500;

        //
        account1.showBalance();
        account2.showBalance();

        account1.deposit(50);
        account1.showBalance();

        // one encapsulation
        account1.balance = -500;
        account1.showBalance();

        // mit encapsulation
        BestBankAccount account = new BestBankAccount();
        account.deposit(-500);
        System.out.println("owner: " + account.getBalace());
        account.deposit(1000);
        System.out.println("owner: " + account.getBalace());
    }
}
