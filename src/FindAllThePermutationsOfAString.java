import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindAllThePermutationsOfAString {

    HashSet<String> hs = new HashSet<>();
    public void findPermutaion(String str, String prefix){
        if(str.isEmpty()){
            hs.add(prefix);
        } else{
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                String rem = str.substring(0, i) + str.substring(i+1);

                findPermutaion(rem, prefix + ch);
            }
        }
    }

    public List<String> find_permutation(String S) {
        // Code here

        findPermutaion(S, "");

        List<String> list = new ArrayList<>(hs);
        Collections.sort(list);
        return list;
    }
}
