public class Game {
    private  Player player;
    private Computer computer;
    private int rounds;

    public Game(int rounds) {
        this.player = new Player();
        this.computer = new Computer();
        this.rounds = rounds;
    }

    public void start() {
        System.out.println("Добро пожаловать в игру: Камень - Ножницы - Бумага!");

        for (int i = 1; i <= rounds; i++) {
            System.out.println("Раунд " + i);
            int playerChoice = player.makeChoice();
            int computerChoice = computer.makeChoice();

            System.out.println("Игрок выбрал: " + computerChoice(playerChoice));
            System.out.println("Компьютер выбрал " + computerChoice(computerChoice));

            //0 - Камень, 1 - Ножницы, 2 - Бумага

            if (playerChoice == computerChoice) {
                System.out.println("Ничья");
            } else if ((playerChoice == 0 && computerChoice == 1) ||
                    (playerChoice == 1 && computerChoice == 2) ||
                    (playerChoice == 2 && computerChoice == 0)){
                System.out.println("Вы выиграли раунд!");
                player.increaseScore();
            } else {
                System.out.println("Компьютер выиграл раунд");
                computer.increaseScore();
            }

            System.out.println("Счёт: Игрок " + player.getScore() + " - " + computer.getScore() + " компьютер");
            System.out.println();
        }
        endGame();
    }

    private void endGame() {
        System.out.println("Игра завершена!");
        if (player.getScore() > computer.getScore()) {
            System.out.println("Поздравляем! вы победили!");
        } else if (player.getScore() < computer.getScore()) {
            System.out.println("Компьютер победил!");
        } else {
            System.out.println("Игра закончилась в ничью");
        }

    }

    private String computerChoice(int choice) {
        switch (choice) {
            case 0: return "Камень";
            case 1: return "Ножницы";
            case 2: return "Бумага";
            default: return "Неизвестно";
        }
    }

}

