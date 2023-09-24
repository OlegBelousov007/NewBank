public class BankCard implements Card {
    private int cardNumber;
    private int pinCode;
    private int cvv;

    public BankCard(int cardNumber,int pinCode,int cvv){
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.cvv = cvv;
    }


    public String getCardNumber() {
        return null;
    }


    public int getPinCode() {
        return 9090;
    }

    public int getCvv() {
        return 0;
    }
}
