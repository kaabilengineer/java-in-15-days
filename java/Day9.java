public class Day9 {
    public static String Reverse(String s){
        String result = "";
        for(int i = s.length()-1; i >= 0; i--){
            result += s.charAt(i);
            }
        return result;
    }

    public static int IsPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return 0;
            i++;
            j--;
            }
            return 1;
    }

    public static void CountVowels(String s) {
        int vowels = 0;
        int consonants = 0;
        s = s.toLowerCase(); // Convert to lowercase to handle uppercase letters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') { // Ensure we only count alphabetic characters
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }

    public static void main(String[] args){
        String s = "dad";
        System.out.println(Reverse(s));
        System.out.println(IsPalindrome(s));
        CountVowels(s);
    }
}