package ua.com.alevel.nix.homework11.data;

import java.util.AbstractList;

public class ForwardLinkedList<T> extends AbstractList<T> {

    //2. Реализовать собственный односвязный список ForwardLinkedList (должен наследовать AbstractList).
    //В качестве примера использовать java.util.LinkedList


    private int size;
    private Node<T> first;


    public ForwardLinkedList() {
        this.size = 0;
    }


    private static class Node<T> {

        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }


    @Override
    public int size() {

        int count = 0;
        if (first != null) {
            count++;
            while (first.next != null) {
                count++;
                first = first.next;
            }
        } else {
            return 0;
        }
        return count;
    }


    @Override
    public T get(int index) {

        int i = 0;
        Node<T> current = first;

        while (current.next != null) {
            if (i == index) {
                return current.value;
            }
            if (i + 1 != index) return null;
            i++;
            current = current.next;
        }
        return current.value;
    }


    public void addForth(T newValue) {

        if (first == null) {
            first = new Node<T>(newValue);
        }
        Node<T> newObject = new Node<T>(newValue);
        newObject.next = first;
        first = newObject;
        size++;
    }


    public void addBack(T newValue) {

        if (first == null) {
            first = new Node<T>(newValue);
        } else {
            Node<T> lastOne = first;
            while (lastOne.next != null) {
                lastOne = lastOne.next;
            }
            lastOne.next = new Node<T>(newValue);
        }
    }


    public Node<T> getNode(int index) {

        int i = 0;
        Node<T> current = first;

        while (current.next != null) {
            if (i == index) {
                return current;
            }
            i++;
            current = current.next;
        }
        return current;
    }

    public void delete(int index) {
        if (index == 0) {
            if (first != null) {
                first = first.next;
            }
            return;
        }

        Node<T> Parent = this.getNode(index - 1);
        Node<T> Inheritor = this.getNode(index + 1);

        Parent.next = null;

        if (Inheritor != null) {
            Parent.next = Inheritor;
        }
    }



    public void printValues() {
        Node<T> current = first;
        while (current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
        System.out.println("-------------------------------------------------");
    }
}
