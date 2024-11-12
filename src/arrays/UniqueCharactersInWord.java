package arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersInWord {
    public static void main(String[] args) {
        String str = "thhe lampbrick shoove grrain cuup blold ferrn";
        String[] wordsArray = str.split(" ");
        for (String word : wordsArray) {
            if (word.chars().distinct().count() == word.length()) {
                System.out.println(word);
            }
        }
    }
        private static boolean hasAllUniqueCharacters(String word) {
        Set<Character> charSet = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
