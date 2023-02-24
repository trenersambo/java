import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
		Sed vitae nulla vel mi laoreet tempus.";

        Map<Integer, List<String>> wordsByLength = new TreeMap<>();
        String[] words = text.split("\\W+");
        for (String word : words) {
            int length = word.length();
            List<String> list = wordsByLength.getOrDefault(length, new ArrayList<>());
            list.add(word);
            wordsByLength.put(length, list);
        }

        for (Map.Entry<Integer, List<String>> entry : wordsByLength.entrySet()) {
            System.out.println("Слова длины " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
