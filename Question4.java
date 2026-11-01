import java.util.Random;

public class Question4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int p1roll1 = rand.nextInt(6) + 1;
        int p1roll2 = rand.nextInt(6) + 1;
        int p2roll1 = rand.nextInt(6) + 1;
        int p2roll2 = rand.nextInt(6) + 1;

        int score1 = p1roll1 + p1roll2;
        int score2 = p2roll1 + p2roll2;

        System.out.println("Player 1: " + p1roll1 + ", " + p1roll2);
        System.out.println("Player 1 total: " + score1);

        System.out.println("Player 2: " + p2roll1 + ", " + p2roll2);
        System.out.println("Player 2 total: " + score2);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score2 > score1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
