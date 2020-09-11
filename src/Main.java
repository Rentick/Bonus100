public class Main {
    public static void main(String[] args) {
        int amountClient = 200;
        long amount = 1200;
        long bonusAmount = 100;
        long totalBonus = amount / bonusAmount;
        long total = amountClient + amount + totalBonus;
        long limit = 1000;
        if (amount > limit) {
            total = amountClient + amount + totalBonus;;
        }
        else {
            total = amountClient + amount;
        }

        System.out.println(total);
    }
}