public class Main {
    public static void main(String[] args) {
        Bkash b = new Bkash();
        Nagad n = new Nagad();
        Rocket r = new Rocket();
        System.out.println("Bkash Payment Charge: "+b.paymentCharge());
        b.paymentConfirmation();
        System.out.println("Nagad Payment Charge: "+n.paymentCharge());
        n.paymentConfirmation();
        System.out.println("Rocket Payment Charge: "+r.paymentCharge());
        r.paymentConfirmation();
    }
}