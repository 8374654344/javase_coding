import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        // Define a mapping of closing parentheses to their corresponding opening parentheses
        String openingParentheses = "({[";
        String closingParentheses = ")}]";
        
        for (char ch : S.toCharArray()) {
            if (openingParentheses.indexOf(ch) != -1) {
                // If the character is an opening parenthesis, push it onto the stack
                stack.push(ch);
            } else if (closingParentheses.indexOf(ch) != -1) {
                // If the character is a closing parenthesis
                // Check if the stack is empty or if the top element of the stack matches the current closing parenthesis
                if (stack.isEmpty() || stack.peek() != getMatchingOpeningParenthesis(ch)) {
                    return false;
                }
                // Pop the matching opening parenthesis from the stack
                stack.pop();
            }
        }
        
        // After processing all characters, the stack should be empty if the parentheses are balanced
        return stack.isEmpty();
    }
    
    private static char getMatchingOpeningParenthesis(char closingParenthesis) {
        switch (closingParenthesis) {
            case ')':
                return '(';
            case '}':
                return '{';
            case ']':
                return '[';
            default:
                return '\0'; // Invalid character
        }
    }

    public static void main(String[] args) {
        String S = "[{(})[]";
        boolean result = isValidParentheses(S);
        if (result) {
            System.out.println("The string contains valid parentheses.");
        } else {
            System.out.println("The string does not contain valid parentheses.");
        }
    }
}
