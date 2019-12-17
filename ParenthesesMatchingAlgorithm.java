import java.lang.String;
import java.util.Stack;
import java.util.Scanner;

public class ParenthesesMatchingAlgorithm {
    // input: an array X of n String tokens,
    public static void main(String[] args){
        // take in user's input
        Scanner userInput = new Scanner(System.in);

        System.out.println("Pls input a string of various parentheses( i.e {]}{}[]{][{}[[[[]]] ):  ");
        System.out.println("Supported parentheses are : <>, {}, [] .");
        String input = userInput.nextLine();

        System.out.println("Those parentheses matching = " + parenMatch(input));

    }

    private static boolean parenMatch(String str){

        if (str.isEmpty())
            return true;

        // initialize a Stack
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);

            if(current == '{' || current == '(' || current == '[' || current == '<'){
                stack.push(current);
            }

            if(current == '}' || current == ')' || current == ']' || current == '>'){

                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[' || current == '>' && last == '<') {
                    stack.pop();
                }
                else
                    return false;

            }
        }

        return stack.isEmpty();
    }
}
