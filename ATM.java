public interface ATM {
    void insertCard(Card card);
    void enterPinCode(int pinCode);
    void requestBalance();
    void deposit(double amount);
    void withdraw(double amount);
}
