package com.nazaralwi;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyStack previousValues = new MyStack();
        int[] numbersA = { 0, 8, 4, 12, 2, 10 };
        String[] numbersB = new String[numbersA.length];
        int smallestValue = 0;

        for (int i = 0; i < numbersA.length; i++) {
            int top;
            Node node;
            previousValues.makeEmpty();

            for (int j = i; j >= 0; j--) {
                node = new Node(numbersA[j]);

                previousValues.push(node);
            }

            while (!previousValues.isEmpty()) {
                top = (int) previousValues.top();

                if (top < numbersA[i]) {
                    smallestValue = top;
                }

                previousValues.pop();
            }

            if (i == 0) {
                numbersB[i] = "-";
            } else {
                numbersB[i] = "" + (smallestValue);
            }
        }

        System.out.println(Arrays.toString(numbersB));
    }
}
