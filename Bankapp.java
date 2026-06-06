import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {

    static ArrayList<Account> accounts =
            new ArrayList<>();

    static Scanner sc =
            new Scanner(System.in);

    public static Account findAccount(int accNo) {

        for (Account acc : accounts) {

            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }

        return null;
    }

    public static void createAccount() {

        System.out.print("Account Number: ");
        int accNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Initial Deposit: ");
        double balance = sc.nextDouble();

        System.out.println(
                "1. Savings Account");
        System.out.println(
                "2. Current Account");

        int type = sc.nextInt();

        if (type == 1) {

            accounts.add(
                    new SavingsAccount(
                            accNo,
                            name,
                            balance));

            System.out.println(
                    "Savings Account Created.");
        }
        else {

            accounts.add(
                    new CurrentAccount(
                            accNo,
                            name,
                            balance));

            System.out.println(
                    "Current Account Created.");
        }
    }

    public static void depositMoney() {

        System.out.print("Account Number: ");
        int accNo = sc.nextInt();

        Account acc = findAccount(accNo);

        if (acc != null) {

            System.out.print(
                    "Amount to Deposit: ");

            double amount = sc.nextDouble();

            acc.deposit(amount);
        }
        else {

            System.out.println(
                    "Account Not Found.");
        }
    }

    public static void withdrawMoney() {

        System.out.print(
                "Account Number: ");

        int accNo = sc.nextInt();

        Account acc = findAccount(accNo);

        if (acc != null) {

            System.out.print(
                    "Amount to Withdraw: ");

            double amount = sc.nextDouble();

            acc.withdraw(amount);
        }
        else {

            System.out.println(
                    "Account Not Found.");
        }
    }

    public static void transferMoney() {

        System.out.print(
                "Sender Account: ");

        int senderNo = sc.nextInt();

        System.out.print(
                "Receiver Account: ");

        int receiverNo = sc.nextInt();

        Account sender =
                findAccount(senderNo);

        Account receiver =
                findAccount(receiverNo);

        if (sender != null &&
            receiver != null) {

            System.out.print(
                    "Transfer Amount: ");

            double amount =
                    sc.nextDouble();

            sender.transfer(
                    receiver,
                    amount);
        }
        else {

            System.out.println(
                    "Invalid Account.");
        }
    }

    public static void addInterest() {

        System.out.print(
                "Account Number: ");

        int accNo = sc.nextInt();

        Account acc =
                findAccount(accNo);

        if (acc instanceof SavingsAccount) {

            ((SavingsAccount) acc)
                    .addInterest();
        }
        else {

            System.out.println(
                    "Interest only for Savings Accounts.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println(
                    "\n===== BANK ACCOUNT SIMULATION =====");

            System.out.println(
                    "1. Create Account");
            System.out.println(
                    "2. Deposit");
            System.out.println(
                    "3. Withdraw");
            System.out.println(
                    "4. Transfer");
            System.out.println(
                    "5. Check Balance");
            System.out.println(
                    "6. Account Details");
            System.out.println(
                    "7. Transaction History");
            System.out.println(
                    "8. Add Interest");
            System.out.println(
                    "9. Exit");

            System.out.print(
                    "Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    transferMoney();
                    break;

                case 5:
                    System.out.print(
                            "Account Number: ");

                    Account acc1 =
                            findAccount(
                                    sc.nextInt());

                    if (acc1 != null)
                        acc1.checkBalance();

                    break;

                case 6:
                    System.out.print(
                            "Account Number: ");

                    Account acc2 =
                            findAccount(
                                    sc.nextInt());

                    if (acc2 != null)
                        acc2.displayDetails();

                    break;

                case 7:
                    System.out.print(
                            "Account Number: ");

                    Account acc3 =
                            findAccount(
                                    sc.nextInt());

                    if (acc3 != null)
                        acc3.showTransactions();

                    break;

                case 8:
                    addInterest();
                    break;

                case 9:
                    System.out.println(
                            "Thank You!");
                    break;

                default:
                    System.out.println(
                            "Invalid Choice");
            }

        } while (choice != 9);

        sc.close();
    }
}
