public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(3000000);
        account.showAccDetails();
        account.deposit(500);
        account.showAccDetails();
        account.withdraw(100000);
        account.showAccDetails();
    }
}