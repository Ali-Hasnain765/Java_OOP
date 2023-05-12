public class Rocket implements OnlinePayment{
    @Override
    public float paymentCharge() {
        return 9.90f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirmed by Rocket");
    }
}
