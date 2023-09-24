public class BankUser implements User {
    private String userName;
    private int accountld;
    private double accountBalance;

    public BankUser(String userName,int accountld,double accountBalance){
        this.userName = userName;
        this.accountld = accountld;
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return this.userName;
    }

    public int getAccountid() {
        return this.accountld;
    }


    public double getAccountBalance() {
        return this.accountBalance;
    }
    public void addMoney(double amount){
        this.accountBalance += amount;
    }
    public void minusMoney(double amount){
        this.accountBalance -= amount;
    }
}
