import java.util.Scanner;

public class Player {
    private int score;
    private Scanner scanner;

    public Player() {
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    public int makeChoice() {
        System.out.println("Введите свой выбор: 0 - Камень, 1 - Ножницы, 2 - Бумага:");
        int choice = scanner.nextInt();

        while ((choice < 0 || choice > 2)) {
            System.out.println("Некорректный выбор: Попробуйте снова:");
            choice = scanner.nextInt();
        }

        return choice;
    }

    public void increaseScore() {
        this.score++;
    }

    public  int getScore() {
        return this.score;
    }

}
