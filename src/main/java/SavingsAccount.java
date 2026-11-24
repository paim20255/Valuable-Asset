public class SavingsAccount implements BankAccount {
    private double balance;
    private double interestRate = 0.033;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            return amount;

        } else {
            double withdrawAmount = this.balance;
            this.balance = 0;
            return withdrawAmount;

        }
    }
    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }

}
