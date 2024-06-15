public class ReverseWord {
    public static String reverseWord(String str){
        String [] words = str.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for(int i = words.length-1 ; i >=0 ; i--){
            reversedSentence.append(words[i]);
            if(i>0){
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String str = "I like the MacBook Air M2";
        String reverse = reverseWord(str);
        System.out.println(reverse);
    }
}
