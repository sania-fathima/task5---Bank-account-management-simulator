public class SavingsAccount extends Account {

    private double interestRate = 0.04;

    public SavingsAccount(int accNo,
                          String holder,
                          double balance) {

        super(accNo, holder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if ((balance - amount) >= 500) {

            balance -= amount;

            transactions.add(
                    "Withdrawn ₹" + amount);

            System.out.println("Withdrawal Successful.");
        }
        else {

            System.out.println(
                    "Minimum balance ₹500 must be maintained.");
        }
    }

    public void addInterest() {

        double interest = balance * interestRate;

        balance += interest;

        transactions.add(
                "Interest Added ₹" + interest);

        System.out.println(
                "Interest Added: ₹" + interest);
    }
}
