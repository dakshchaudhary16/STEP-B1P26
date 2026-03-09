public class app {

    public static void main(String[] args){

        String word = "level";

        PalindromeService service = new PalindromeService();

        System.out.println(service.checkPalindrome(word));
    }
}