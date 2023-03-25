package com.ynz.smart.queue;

import java.util.Deque;
import java.util.LinkedList;

public class ListReverseString {
    private static final String str = "This is a new tool.";

    public static void main(String[] args) {
        Deque<Character> characterStack = new LinkedList<>();

        char[] strCharAry = str.toCharArray();
        for (char c : strCharAry) {
            characterStack.push(c);
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
