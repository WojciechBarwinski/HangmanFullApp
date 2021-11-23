import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class WordGenerator {

    private static WordGenerator INSTANCE;
    private static List<String> wordsList;

    private WordGenerator(){
        wordsList = new ArrayList<>();
        wordsList.add("pieseł");
        wordsList.add("drukarka");
        wordsList.add("Dragonsong");
    }

    public static WordGenerator getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new WordGenerator();
        }
        return INSTANCE;
    }

    public static String getRandomWord(){
        Random random = new Random();
        return wordsList.get(random.nextInt(wordsList.size()));
    }
}
