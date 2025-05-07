
public class Main {
    public static void main(String[] args) {
        // Example 1
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        System.out.println("Example 1 Pairs:");
        exampleOne.printPairs();
        System.out.println("Matches: " + exampleOne.numMatches());  // Output: 0
        System.out.println();

        // Example 2
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        System.out.println("Example 2 Pairs:");
        exampleTwo.printPairs();
        System.out.println("Matches: " + exampleTwo.numMatches());  // Output: 1 ("the", "the")
        System.out.println();

        // Example 3 (part b)
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println("Example 3 Pairs:");
        exampleThree.printPairs();
        System.out.println("Matches: " + exampleThree.numMatches());  // Output: 2 ("the", "the"), ("red", "red")
    }
}
