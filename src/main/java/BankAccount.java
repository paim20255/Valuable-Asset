public interface BankAccount extends Valuable{
    void deposit(double amount);

    double withdraw(double amount);

    double getBalance();
}
