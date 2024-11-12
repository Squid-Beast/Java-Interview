package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestWordInString {
    public static void main(String[] args) {
        String str = "the lampbrick shove grain cup bold fern";
        String[] wordsArray = str.split(" ");
        List<String> wordsList = new ArrayList<>();

        for (String word : wordsArray) {
            wordsList.add(word);
        }
        
        wordsList.stream()
        .sorted((word1, word2) -> word2.length() - word1.length())
        .limit(1)
        .forEach(System.out::println);
    }
}