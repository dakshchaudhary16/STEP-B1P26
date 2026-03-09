public class app {

    public static void main(String[] args){

        String word = "Level";

        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        boolean palindrome = true;

        while(left < right){

            if(word.charAt(left) != word.charAt(right)){
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");
    }
}