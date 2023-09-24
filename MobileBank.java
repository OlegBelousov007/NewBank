public class MobileBank {
    private User mainUser;
    private User testUser;
    public MobileBank(){
        mainUser = new BankUser("Олег", 1111, 10000);
        System.out.println("Добро пожаловать, " + mainUser.getUserName());
        testUser = new BankUser("Фёдоров Илья", 2222, 5000);
    }
    public void printUserAcc(){
        System.out.println("Имя пользователя - " + mainUser.getUserName());
        System.out.println("ID аккаунта - " + mainUser.getAccountid());
        System.out.println("Баланс пользователя - " +  mainUser.getAccountBalance());

    }
    public void transferMoney( double amount){
            if (amount > mainUser.getAccountBalance()){
                System.out.println("Недостаточно средств");
            }else{
                mainUser.minusMoney(amount);
                testUser.addMoney(amount);
                System.out.println("Пользователь " + mainUser.getUserName() + " совершил перевод " + testUser.getUserName());
                System.out.println("Сумма перевода - " + amount);
                System.out.println("Состояние баланса - " + mainUser.getUserName() + " состовляет " + mainUser.getAccountBalance());
                System.out.println("Состояние баланса - " + testUser.getUserName() + " состовляет " + testUser.getAccountBalance());
            }

        }

}
