package checking_groups;

import java.util.Stack;

public class CheckingGroups {

    public static boolean groupCheck(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (!stack.empty() && stack.pop() == '(');
                    else return false;
                    break;
                case '}':
                    if (!stack.empty() && stack.pop() == '{');
                    else return false;
                    break;
                case ']':
                    if (!stack.empty() && stack.pop() == '[');
                    else return false;
                    break;
            }
        }
        return stack.empty();
    }
}
