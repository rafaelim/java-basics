package com.rafael.j8.basics.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionFunction {

    public static void main(String[] args) {

        Supplier<List<Integer>> intList = () -> Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Function<List<Integer>, Integer> findFirstEvenNumber = list -> {
            return list.stream().filter(it -> it % 2 == 0).findFirst().get();
        };

        System.out.println(findFirstEvenNumber.apply(intList.get()));
    }
}
