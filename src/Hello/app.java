import java.util.ArrayDeque;
import java.util.Deque;

public class app {

    public static void main(String[] args) {

        String word = "level";

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()){
            deque.addLast(c);
        }

        boolean palindrome = true;

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                palindrome = false;
                break;
            }
        }

        if(palindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}