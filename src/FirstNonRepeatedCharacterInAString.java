import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterInAString {
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        Map<Character, Integer> hm = new LinkedHashMap<>();

        for(char c:S.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return '$';
    }

    static char nonrepeatingCharacterV1(String S)
    {
        //Your code here
        Map<Character, Integer> hm = new HashMap<>();

        for(char c:S.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for(char c:S.toCharArray()){
            if(hm.get(c)==1){
                return c;
            }
        }

        return '$';
    }
}
