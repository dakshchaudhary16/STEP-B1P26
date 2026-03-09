public class app {

    public static void main(String[] args){

        String word = "level";

        PalindromeStrategy strategy = new StackStrategy();

        System.out.println(strategy.check(word));
    }
}