import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfDuplicateWordsInString {
    public static void solution(String input) {
        Map<String, Integer> mp = new LinkedHashMap<>();
        String[] ara = input.toLowerCase().split("\\W");

        for(String s:ara){
            mp.put(s, mp.getOrDefault(s, 0)+1);
        }

        for(Map.Entry<String, Integer> entry: mp.entrySet()){
            if(entry.getValue()>1){
                System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
            }
        }
    }
    public static void main(String[] args) {
        solution("Java is great and Java is fun. Programming in Java is great.");
    }
}
