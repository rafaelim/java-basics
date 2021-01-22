package com.rafael.j8.basics.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunction {
    public static void main(String[] args) {
        Supplier<List<Integer>> idList = () -> Arrays.asList(1,2,3,4);

        System.out.println(idList.get());
    }
}
