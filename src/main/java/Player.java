import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {

    private String wordToGuess;
    private Set<String> wrongAnswer;
    private Set<String> correctAnswer;


    public Player() {
        wrongAnswer = new HashSet<>();
        correctAnswer = new HashSet<>();
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    public Set<String> getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(String wrongAnswer) {
        this.wrongAnswer.add(wrongAnswer);
    }

    public Set<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer.add(correctAnswer);
    }

    public int getStepCounter() {
        return wrongAnswer.size() + correctAnswer.size();
    }


}
