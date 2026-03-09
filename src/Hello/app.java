public class app {

    static boolean check(String word, int start, int end){

        if(start >= end)
            return true;

        if(word.charAt(start) != word.charAt(end))
            return false;

        return check(word, start+1, end-1);
    }

    public static void main(String[] args){

        String word = "level";

        if(check(word,0,word.length()-1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}