public interface User {
    String getUserName();
    int getAccountid();
    double getAccountBalance();
    void addMoney(double amount);
    void minusMoney(double amount);
}
