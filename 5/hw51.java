//version 0

import java.util.*;

public class BracketsChecker {

    public static boolean checkBrackets(String expression) {
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('[', ']');
        bracketsMap.put('{', '}');
        bracketsMap.put('<', '>');
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (bracketsMap.containsKey(c)) {
                stack.push(c);
            } else if (bracketsMap.containsValue(c)) {
                if (stack.empty() || bracketsMap.get(stack.peek()) != c) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String[] expressions = {"()", "[]{}((<>))", ")", "[)", "[]{}(<)>", "{([])}", "([])"};
        for (String expression : expressions) {
            boolean result = checkBrackets(expression);
            System.out.println(expression + " -> " + result);
        }
    }
}

















//version 0.1

import java.util.Stack;

public class BracketChecker {

    public static boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                case '<':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '>':
                    if (stack.isEmpty() || stack.pop() != '<') {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return stack.isEmpty();
    }

	
	
//version 0.1.1

    public static void main(String[] args) {
        String input = "[]{}((<>))";
        System.out.println(check(input)); // true

        input = ")";
        System.out.println(check(input)); // false

        input = "[)";
        System.out.println(check(input)); // false

        input = "[]{}(<)>";
        System.out.println(check(input)); // false
    }
}
