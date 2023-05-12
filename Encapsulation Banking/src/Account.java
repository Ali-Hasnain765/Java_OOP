public class Account {
    private String AccName= "Aziz";
    private double Balance;
    private String Bank= "HSBC";


    public void setBalance(double balance) {
        if (balance >= 500) {
            Balance = balance;
        } else {
            System.out.println("Low Balance");
        }
    }
        public void deposit ( double BalDep){
            if (BalDep > 100) {
                System.out.println("Deposited");
                //System.out.println("Deposited Balance:");
                Balance = Balance + BalDep;
            } else {
                System.out.println("Invalid deposit Balance");
            }
        }
        public void withdraw ( double BalWith){
            if (BalWith > 0) {
                //System.out.println("Withdraw Balance:");
                Balance = Balance - BalWith;
            } else {
                System.out.println("Invalid withdraw");

            }
        }

        public double getBalance() {
            return Balance;
        }

public void showAccDetails(){
            System.out.println(AccName);
            System.out.println(Balance);
            System.out.println(Bank);
        }
}
