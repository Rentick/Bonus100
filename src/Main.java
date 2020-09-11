public class Main {
    public static void main(String[] args) {
        long amount = 1100;
        long bonusAmount = 100;
        long totalBonus = 0;
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