package question3;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] words = {"actors", "costar", "altered", "related", "auctioned", "education", "aspired", "despair", "mastering", "streaming", "recurd", "secured"};
        List<List<String>> groupedAnagrams = groupAnagrams(words);

        for (List<String> anagramGroup : groupedAnagrams) {
            System.out.println(anagramGroup);
        }
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }

}
