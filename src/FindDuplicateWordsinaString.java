import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordsinaString {
    public static void solution(String input) {
//        String[] ara = arg.split("\\s+");
//        Map<String, Integer> mp  = new HashMap<>();
//
//        for(String s: ara){
//            mp.put(s, mp.getOrDefault(s, 0)+1);
//        }
//
//        for(Map.Entry<String, Integer> entry: mp.entrySet()){
//            if(entry.getValue()>1){
//                System.out.print(entry.getKey()+" ");
//            }
//        }
//        System.out.println();

        String[] words = input.toLowerCase().split("\\s+");

        // Step 3: Use a HashMap to track word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Step 4: Identify and display duplicate words
        System.out.print("Duplicate words: ");
        boolean hasDuplicates = false;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.print("No duplicates found.");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        solution("This is a test. This test is easy.");
        solution("Java is great and Java is powerful");
    }
}
