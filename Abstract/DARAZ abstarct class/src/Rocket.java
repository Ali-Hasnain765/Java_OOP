public class Rocket extends OnlineBanking{
@Override
    public float paymentCharge() {
        return 9.99f;
    }


    public void paymentConfirmation() {

    System.out.println("Payment Confirmed by Rocket");
    }
}
