package org.example.hw230424.Task2;

import java.util.Stack;

public class Program2 {
    public static void main(String[] args) {
        String someStr = "(){}[]";
        System.out.println(isValid(someStr));
    }

    /**
     *
     * @param str строка, содержащая '(', ')', '{', '}', '[' и ']'
     * @return true - если после каждой открытой скобки следует аналогичная закрытая, false - если нет.
     */
    public static boolean isValid(String str) {
        boolean valid = false;
        String[] checkArray = str.split("");
        Stack<String> checkStack = new Stack<>();
        for (String s : checkArray) {
            if (checkStack.isEmpty() && (s.equals("(") || s.equals("{") || s.equals("["))) {
                checkStack.add(s);
                valid = false;
            } else if ((!checkStack.isEmpty())
                    && ((checkStack.peek().equals("(") && s.equals(")"))
                    || (checkStack.peek().equals("{") && s.equals("}"))
                    || (checkStack.peek().equals("[") && s.equals("]"))) ) {
                checkStack.pop();
                valid = true;
            } else
                return false;
        }
    return valid;
    }
}
