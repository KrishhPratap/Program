public class ReverseString {
    public static String reverseString(String str){
        String Reversed_String = "";
        StringBuffer sb = new StringBuffer(str);
        for (int i=str.length()-1 ; i>=0; i--){
            Reversed_String += sb.charAt(i);
        }
        return Reversed_String;
    }

    public static void main(String[] args) {
        String str = "Krishan";
        System.out.println(str);
        System.out.println(reverseString(str));
    }
}
