import java.util.Scanner;

public class Turn {
    private static Player currentPlayer;

    public static void startGame(Player player1) {
        currentPlayer = player1;
    }

    public static void switchTurn(Player player1, Player player2) {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public static boolean play() {
        System.out.println(currentPlayer.getName() + ", your turn. Guess a letter.");
        Scanner sc = new Scanner(System.in);
        String guess = sc.nextLine();

        if (guess.length() != 1) {
            System.out.println("Please enter exactly one letter.");
            return play();
        }

        boolean correct = Display.modifyStructure(guess);

        if (correct) {
            System.out.println("Correct guess!");
        } else {
            System.out.println("Sorry, that letter is not in the phrase.");
        }

        return correct;
    }

}