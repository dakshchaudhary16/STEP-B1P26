import java.util.*;

public class app {

    public static void main(String[] args) {

        String word = "level";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            queue.add(c);
            stack.push(c);
        }

        boolean palindrome = true;

        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
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