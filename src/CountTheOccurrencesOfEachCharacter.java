import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountTheOccurrencesOfEachCharacter {
    public static void solution(String input) {
        HashMap<Character, Integer> hm = new LinkedHashMap<>();

        for(char c: input.toLowerCase().toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            System.out.print(entry.getKey() + ": " + entry.getValue()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        solution("hello");
        solution("programming");
    }
}
