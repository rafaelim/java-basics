package com.rafael.j8.basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Examples {


    public static void main(String[] args) {
        Supplier<List<Integer>> intList = () -> Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Supplier<List<Integer>> duplicateValuesList = () -> Arrays.asList(1,2,2,2,2,4,3,2,4,6,5,6,4,7,8,9,8,10);

        intList.get().stream()
                .filter(it -> it % 2 == 0)
                .forEach(System.out::println);

        List<Integer> evenNumbers = intList.get().stream()
                .filter(it -> it % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> evenNumbersLimit3 = duplicateValuesList.get().stream()
                .filter(it -> it % 2 == 0)
                .distinct()
                .limit(3)
                .collect(Collectors.toList());

        List<Integer> doubleNumbers = intList.get().stream()
                .map(it -> it * 2)
                .collect(Collectors.toList());


        System.out.println("evenNumbers: "+ evenNumbers);
        System.out.println("evenNumbersLimit3: "+ evenNumbersLimit3);
        System.out.println("doubleNumbers: "+ doubleNumbers);

    }
}
