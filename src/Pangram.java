import java.util.HashSet;
import java.util.Set;

public class Pangram {
    static boolean checkPangram(String str){
        Set<Character> st = new HashSet<Character>();
        for(char ch : str.toCharArray()){
            if (ch >= 'a' && ch <= 'z')
                st.add(ch);

            if (ch >= 'A' && ch <= 'Z') {
                ch = Character.toLowerCase(ch);
                st.add(ch);
            }
        }
        return st.size()== 26;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if(checkPangram(str)){
            System.out.println("Is Pangram");
        }
        else {
            System.out.println("Not Pangram");
        }
    }
}
