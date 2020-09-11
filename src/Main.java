public class Main {
    public static void main(String[] args) {
        int amountClient = 200;
        long amount = 1200;
        long bonusAmount = 100;
        long totalBonus = 0;
        long total = amountClient + amount + totalBonus;
        long limit = 1000;
        if (amount > limit) {
            totalBonus = amount / bonusAmount;
        }
        else {
            totalBonus = 0;
        }

        System.out.println(totalBonus);
    }
}