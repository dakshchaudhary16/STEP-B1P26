import java.util.Stack;

public class app {

    public static void main(String[] args) {

        String word = "level";

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()){
            reversed = reversed + stack.pop();
        }

        if(word.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}