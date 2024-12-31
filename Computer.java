import java.util.Random;

public class Computer {
    private  int score;
    private Random random;

    public  Computer() {
        this.score = 0;
        this.random = new Random();
    }

    public int makeChoice() {
        return random.nextInt(3);
    }

    public void increaseScore() {
        this.score++;
    }

    public int getScore() {
        return this.score;
    }
}










