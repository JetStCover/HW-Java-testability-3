public class CreditPaymentService {
    public int calculate( int money, int mouth) {

        double percent = 9.99 / (100 * 12);
        double percentResult = Math.pow(1 + percent, mouth);

        return (int) (money * ((percent * percentResult) / (percentResult - 1)));
    }

}
