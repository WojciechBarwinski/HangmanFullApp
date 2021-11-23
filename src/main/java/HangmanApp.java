import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanApp {

    private List<String> wordsList;
    private final int STEPS = 10;
    private Player player;

    public HangmanApp() {
        this.wordsList = new ArrayList<>();
        wordsList.add("pieseł");
        wordsList.add("drukarka");
        wordsList.add("Dragonsong");
    }


    void gameStart(Player player){
        this.player = player;
        while (player.getStepCounter() < STEPS){
            String letterFromPlayer = getLetterFromPlayer();
            if (player.getWordToGuess().contains(letterFromPlayer)){
                player.setCorrectAnswer(letterFromPlayer);
            }
            else {
                player.setWrongAnswer(letterFromPlayer);
            }
        }
    }


    private String getLetterFromPlayer() {
        System.out.println("podaj jakas litere: ");
        Scanner scanner = new Scanner(System.in);
        String playerInput;
        boolean isCorrect = true;
        do {
            playerInput = scanner.nextLine();
            if (!playerInput.matches("^[a-zA-Z]$")) {
                System.out.println("Podełes złe znaki, prosze podac tylko 1 litere");
            } else {
                System.out.println("podales: " + playerInput);
                isCorrect = false;
            }
        }
            while (isCorrect) ;
            return playerInput;
    }


}
