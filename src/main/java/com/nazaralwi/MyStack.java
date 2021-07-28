package com.nazaralwi;

public class MyStack {
    Node tos;

    public boolean isEmpty() {
        return (tos==null);
    }

    void push(Node input) {
        if(isEmpty()){
            tos = input;
        } else {
            input.next = tos;
            tos = input;
        }
    }

    Object pop() {
        if(!isEmpty()) {
            Node temp = tos;
            tos = tos.next;
            temp.next = null;
            return temp.data;
        } else {
            return -1;
        }
    }

    void show() {
        if(!isEmpty()) {
            Node temp = tos;
            System.out.print("[ ");
            while (temp!=null) {
                System.out.print(temp.data.toString() + ", ");
                temp = temp.next;
            }
            System.out.print(" ]");
        } else {
            System.out.println("Stack kosong!");
        }
    }

    Object top() {
        Node temp = tos;

        return temp.data;
    }

    Object topAndPop() {
        this.top();
        return this.pop();
    }

    void makeEmpty() {
        tos = null;
    }
}
