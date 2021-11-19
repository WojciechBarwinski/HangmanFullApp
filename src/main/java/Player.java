import java.util.ArrayList;
import java.util.List;

public class Player {

    private String wordToGuess;
    private List<String> wrongAnswer;
    private List<String> correctAnswer;
    private int stepCounter;

    public Player() {
        wrongAnswer = new ArrayList<>();
        correctAnswer = new ArrayList<>();
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    public List<String> getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(String wrongAnswer) {
        this.wrongAnswer.add(wrongAnswer);
    }

    public List<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer.add(correctAnswer);
    }

    public int getStepCounter() {
        return stepCounter;
    }

    public void addCounter(){
        this.stepCounter++;
    }
}
