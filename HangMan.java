public class HangMan {
    public static void main(String[] args) {
        Player one = new Player();
        Player two = new Player();

        Turn.startGame(one);

        System.out.println("Here is your phrase: ");
        Display.initStructure();

        int maxGuesses = 6;
        int wrongGuesses = 0;

        while (!Display.isComplete() && wrongGuesses < maxGuesses) {
            System.out.println(Display.getCurrentStructure());
            boolean correct = Turn.play();

            if (!correct) {
                wrongGuesses++;
                System.out.println("Wrong guesses: " + wrongGuesses + "/" + maxGuesses);
            }

            if (!Display.isComplete()) {
                Turn.switchTurn(one, two);
            }
        }

        if (Display.isComplete()) {
            System.out.println("Congratulations! The phrase was: " + Display.getSecretPhrase());
        } else {
            System.out.println("Game over! The phrase was: " + Display.getSecretPhrase());
        }
    }
}