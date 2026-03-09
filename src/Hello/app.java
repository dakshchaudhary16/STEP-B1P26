public class app {

    static boolean reverseMethod(String word){

        String reversed="";

        for(int i=word.length()-1;i>=0;i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    static boolean iterativeMethod(String word){

        int left=0;
        int right=word.length()-1;

        while(left<right){

            if(word.charAt(left)!=word.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    // UC2 - Hardcoded palindrome
    public static void hardcodedPalindrome() {

        String word = "madam";
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if(word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args){

        hardcodedPalindrome();

        String word="level";

        long start = System.nanoTime();
        reverseMethod(word);
        long end = System.nanoTime();

        System.out.println("Reverse Method Time: "+(end-start));

        start = System.nanoTime();
        iterativeMethod(word);
        end = System.nanoTime();

        System.out.println("Iterative Method Time: "+(end-start));
    }
}