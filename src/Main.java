public class Main {
    public static void main(String[] args) {
        int startBalance = 128;
        int deposit = 4233;
        int bonus;

        if (deposit > 1000 ) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}