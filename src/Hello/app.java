import java.util.*;

public class app {

    public static void main(String[] args) {

        String word = "level";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // enqueue and push
        for(char c : word.toCharArray()){
            queue.add(c);
            stack.push(c);
        }

        boolean palindrome = true;

        // compare FIFO vs LIFO
        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
                palindrome = false;
                break;
            }
        }

        if(palindrome){
            System.out.println(word + " is a Palindrome");
        }else{
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}