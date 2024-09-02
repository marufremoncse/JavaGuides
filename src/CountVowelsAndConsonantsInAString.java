public class CountVowelsAndConsonantsInAString {

    public static void solution(String input) {
        int vc = 0, cc = 0;

        for(char c: input.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vc++;
                } else{
                    cc++;
                }
            }
        }
        System.out.println(String.format("Vowels : %d, Consonants: %d", vc, cc));
    }

    public static void main(String[] args) {
        solution("Hello World");
        solution("Java Programming");
    }
}
