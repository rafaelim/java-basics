package com.rafael.j8.basics.functions;

import java.util.function.Predicate;

public class PredicateFunction {

    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        Predicate<Integer> isGreaterThanTen = (number) -> number > 10;

        Predicate<Integer> isGreaterThanTenAndIsEven = isEven.and(isGreaterThanTen);


        System.out.println(isEven.test(9));
        System.out.println(isEven.test(10));
        System.out.println(isGreaterThanTen.test(10));
        System.out.println(isGreaterThanTen.test(14));
        System.out.println(isGreaterThanTenAndIsEven.test(12));
        System.out.println(isGreaterThanTenAndIsEven.test(2));
    }

}
