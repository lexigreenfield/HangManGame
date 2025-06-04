import java.util.Scanner;

public class Player {
    private String name;

    public Player() {
        Scanner n = new Scanner(System.in);
        System.out.println("What is this player's name?");
        String nam = n.nextLine();
        name = nam;
    }

    public String getName() {
        return name;
    }

}