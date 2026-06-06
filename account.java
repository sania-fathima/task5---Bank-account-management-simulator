import java.util.ArrayList;

public class Account {

    protected int accountNumber;
    protected String accountHolder;
    protected double balance;
    protected ArrayList<String> transactions;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        transactions = new ArrayList<>();

        transactions.add("Account created with balance ₹" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited ₹" + amount);
        System.out.println("Deposit Successful.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn ₹" + amount);
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void transfer(Account receiver, double amount) {

        if (amount <= balance) {

            balance -= amount;
            receiver.balance += amount;

            transactions.add(
                    "Transferred ₹" + amount +
                    " to Account " + receiver.accountNumber);

            receiver.transactions.add(
                    "Received ₹" + amount +
                    " from Account " + accountNumber);

            System.out.println("Transfer Successful.");
        }
        else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void showTransactions() {

        System.out.println("\nTransaction History:");

        for (String t : transactions) {
            System.out.println(t);
        }
    }

    public void displayDetails() {

        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
