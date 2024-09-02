import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInAString {
    public static void solution(String s){
        Map<Character, Integer> mp = new HashMap<>();

        for(char c:s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey() +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        solution("programming");
        solution("hello");
    }
}
