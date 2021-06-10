package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- test ----");
        System.out.println(createDictionary("opa boba buba krok argh coup damn"));
    }

    public static List<String> createDictionary(String text) {
        List<String> dictionary = Arrays.asList(text.split(" "));
        return dictionary.stream()
            .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
