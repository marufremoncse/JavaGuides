import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNumberOfWordsInString {
    //Count Number of Words in String
    public static void solutionUsingSplit(String input) {
        String[] ara = input.toLowerCase().split("\\W");
        System.out.println("Using split() method: " + ara.length);
    }
    public static void solutionUsingStringTokenizer(String input) {
        StringTokenizer st = new StringTokenizer(input);
        System.out.println("Using StringTokenizer: " + st.countTokens());
    }
    public static void solutionUsingPatternMatcher(String input) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println("Using Pattern Matcher: " + count);
    }

    public static void main(String[] args) {
        solutionUsingSplit("Java is great and Java is fun.");
        solutionUsingStringTokenizer("Java is great and Java is fun.");
        solutionUsingPatternMatcher("Java is great and Java is fun.");
    }
}
