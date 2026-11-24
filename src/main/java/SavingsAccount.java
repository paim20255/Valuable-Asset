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
        return 0;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public double getValue() {
        return 0;
    }

}
