import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurrencesOfWordsInAString {
    public static void solution(String input){
        String[] ara = input.toLowerCase().split("\\W+");
        Map<String, Integer> mp = new LinkedHashMap<>();
        for(String s:ara){
            mp.put(s, mp.getOrDefault(s, 0)+1);
        }

        for(Map.Entry<String, Integer> entry: mp.entrySet()){
            System.out.print(entry.getKey() + ": " + entry.getValue()+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solution("This is a test. This test is easy.");
        solution("Java is great and Java is powerful");
    }
}
