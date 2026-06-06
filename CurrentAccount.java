public class CurrentAccount extends Account {

    private double overdraftLimit = 5000;

    public CurrentAccount(int accNo,
                          String holder,
                          double balance) {

        super(accNo, holder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (balance + overdraftLimit >= amount) {

            balance -= amount;

            transactions.add(
                    "Withdrawn ₹" + amount);

            System.out.println("Withdrawal Successful.");
        }
        else {

            System.out.println(
                    "Overdraft Limit Exceeded.");
        }
    }
}
