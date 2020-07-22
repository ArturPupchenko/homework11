package ua.com.alevel.nix.homework11.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

    //    1. Для списка строк, отфильтровать все цифры, встречающиеся во всех строках, и собрать их в общее десятичное число. Например:
    //    Строки [“string 1 text”, “2 string 3 text”, “45”] дадут результат 12345
    //    Подсказка: у Character есть методы digit и isDigit, а у String - codepoints()
    //    Рекомендуется использовать Stream API.

    public static void filterNumbersFromListOfStrings() {
        System.out.println("Задание 1\nДля списка строк:");
        List<String> strings = new ArrayList<>();
        strings.add("string 1 text");
        strings.add("2 string 3 text");
        strings.add("45");
        System.out.println("string 1 text");
        System.out.println("2 string 3 text\"");
        System.out.println("45");
        System.out.println("Отфильтровать все цифры, встречающиеся во всех строках,\n" +
                "и собрать их в общее десятичное число.");
        String stringResult = strings.stream()
                .map(s -> s.codePoints()
                        .mapToObj(i -> (char) i)
                        .filter(Character::isDigit)
                        .map(String::valueOf)
                        .collect(Collectors.joining("")))
                .collect(Collectors.joining(""));
        Integer result = Integer.valueOf(stringResult);
        System.out.println("Результат:");
        System.out.println(result);
    }
}
