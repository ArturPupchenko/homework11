package ua.com.alevel.nix.homework11.main;

import ua.com.alevel.nix.homework11.data.ForwardLinkedList;
import ua.com.alevel.nix.homework11.data.StringFilter;

public class Main {
//    1. Для списка строк, отфильтровать все цифры, встречающиеся во всех строках, и собрать их в общее десятичное число. Например:
//    Строки [“string 1 text”, “2 string 3 text”, “45”] дадут результат 12345
//    Подсказка: у Character есть методы digit и isDigit, а у String - codepoints()
//    Рекомендуется использовать Stream API.
//            2. Реализовать собственный односвязный список ForwardLinkedList (должен наследовать AbstractList).
//    В качестве примера использовать java.util.LinkedList

    public static void main(String[] args) {


        StringFilter.filterNumbersFromListOfStrings();

        System.out.println("\n-------------------------------------------------");
        System.out.println("Задание 2");
        System.out.println("Реализовать собственный односвязный список ForwardLinkedList.");
        ForwardLinkedList <Integer> list = new ForwardLinkedList<>();
        System.out.println("Добавим 1 назад");
        list.addBack(1);
        list.printValues();
        System.out.println("Добавим 2 вперед");
        list.addForth(2);
        list.printValues();
        System.out.println("Добавим 3 назад");
        list.addBack(3);
        list.printValues();
        System.out.println("Добавим 4 вперед");
        list.addForth(4);
        list.printValues();
        System.out.println("Добавим 5 назад");
        list.addBack(5);
        list.printValues();
        System.out.println("Добавим 6 вперед");
        list.addForth(6);
        list.printValues();
        System.out.println("Удалим элемент с индексом 2");
        list.delete(2);
        list.printValues();
        System.out.println("В списке " + list.size() + " элементов.");


    }


}
