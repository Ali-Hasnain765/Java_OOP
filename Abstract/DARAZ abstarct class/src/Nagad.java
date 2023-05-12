public class Nagad extends OnlineBanking {
@Override
    public float paymentCharge() {
        return 9.50f;
    }

    public void paymentConfirmation() {
        System.out.println("Payment Confirmed by Nagad");
    }
}
