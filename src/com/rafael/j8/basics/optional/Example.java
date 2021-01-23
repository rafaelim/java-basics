package com.rafael.j8.basics.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Example {


    private void attendeesOptional() {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        Optional<Integer> result = integerList.stream().reduce(Integer::sum);
        System.out.println(result.get());
    }

    private void nonAttendeesOptional() {
        List<Integer> integerList = Collections.emptyList();
        Optional<Integer> result = integerList.stream().reduce(Integer::sum);
        if(result.isPresent()) {
            System.out.println(result.get());
        }
    }

    private void ifElseOptionals() {
        String test = null;
        Optional<String> optionalResult = Optional.ofNullable(test);
        String finalResult = optionalResult.orElse("DEFAULT VALUE");
        System.out.println(finalResult);
    }

    private void ifElseThrowOptionals() throws Exception {
        String test = null;
        Optional<String> optionalResult = Optional.ofNullable(test);
        String finalResult = optionalResult.orElseThrow(Exception::new);
    }


    public static void main(String[] args) {
        new Example().attendeesOptional();
        new Example().nonAttendeesOptional();
        new Example().ifElseOptionals();

        try {
            new Example().ifElseThrowOptionals();
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
