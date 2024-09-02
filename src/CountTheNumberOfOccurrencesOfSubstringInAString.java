import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountTheNumberOfOccurrencesOfSubstringInAString {
    public static void solutionUsingSplit(String input, String subString){
        String[] ara = input.split(subString, -1);
        int count = ara.length - 1;

        System.out.println("Using split: " + count);
    }

    public static void solutionUsingIndexOf(String input, String subString){
        int count = 0;
        int index = 0;

        while((index = input.indexOf(subString, index))!=-1){
            count++;
            index+=subString.length();
        }

        System.out.println("Using IndexOf: " + count);
    }

    public static void solutionUsingRegex(String input, String subString){
        int count = 0;
        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            count++;
        }

        System.out.println("Using Regex: " + count);
    }
    public static void main(String[] args) {
        solutionUsingSplit("Java is great. Java is fun. Java is powerful.", "Java");
        solutionUsingIndexOf("Java is great. Java is fun. Java is powerful.", "Java");
        solutionUsingRegex("Java is great. Java is fun. Java is powerful.", "Java");

    }
}
