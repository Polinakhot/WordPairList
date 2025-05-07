import java.util.ArrayList;
public class WordPairList {
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    /**
     * Returns the number of matches as described in part (b).
     */
    public int numMatches() {
        int count = 0;
        for (WordPair wp : allPairs) {
            if (wp.getFirst().equals(wp.getSecond())) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public void printPairs() {
        for (WordPair wp : allPairs) {
            System.out.println(wp);
        }
    }
}