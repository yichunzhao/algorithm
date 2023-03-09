package com.ynz.smart.queue;

import java.util.Stack;

public class StackReverseString {
    private static final String str = "This is a new tool.";

    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();

        char[] strCharAry = str.toCharArray();
        for (int i = 0; i < strCharAry.length; i++) {
            characterStack.push(strCharAry[i]);
        }
        System.out.println(characterStack);

        StringBuilder sb = new StringBuilder();
        while (!characterStack.isEmpty()) {
            sb.append(characterStack.pop());
        }

        System.out.println(str);
        System.out.println(sb);
    }
}
