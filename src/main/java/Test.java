import java.util.List;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hello World");

        HangmanApp hangmanApp = new HangmanApp();
        Player player = new Player();
        hangmanApp.gameStart(player);
    }
}
