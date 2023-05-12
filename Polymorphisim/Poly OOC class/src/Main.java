public class Main {
    public static void main(String[] args) {
        Bkash b = new Bkash();
        Nagad n = new Nagad();
        Rocket r = new Rocket();

        System.out.println("Bkash: "+b.cashOutCharge());
        System.out.println("Nagad: "+n.cashOutCharge());
        System.out.println("Rocket: "+r.cashOutCharge());
    }
}