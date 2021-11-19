import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanApp {

    private List<String> wordsList;
    private Player player;
    private final int STEPS = 10;

    public HangmanApp() {
        this.wordsList = new ArrayList<>();
        wordsList.add("pieseł");
        wordsList.add("drukarka");
        wordsList.add("Dragonsong");
    }


    void gameStart(){
        player = new Player();
        player.setWordToGuess(getRandomWord());

        System.out.println(player.getWordToGuess());

        while (player.getStepCounter() < STEPS){
            String letterFromPlayer = getLetterFromPlayer();
            if (player.getWordToGuess().contains(letterFromPlayer)){
                correctAnswer(letterFromPlayer);
            }
            else {
                wrongAnswer(letterFromPlayer);
            }
            player.addCounter();
            System.out.println("to był ruch: " + player.getStepCounter());
        }
        System.out.println("To na razie koniec");
    }
    String getRandomWord(){
        Random random = new Random();
        return this.wordsList.get(random.nextInt(this.wordsList.size()));
    }

    String getLetterFromPlayer() {
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

    void wrongAnswer(String wrongLetter){
        System.out.println("Litery nie ma w słowie - nie Trafiłes");
        player.setWrongAnswer(wrongLetter);
    }

    void correctAnswer(String correctLetter){
        System.out.println("litera jest w słowie - Trafiles!");
        player.setCorrectAnswer(correctLetter);
    }

}
