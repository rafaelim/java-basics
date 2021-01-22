package com.rafael.j8.basics.interfaces;


interface Model {
    default String model() {
        return "DEFAULT MODEL";
    }
}

interface Make {
    default String make() {
        return "DEFAULT MAKE";
    }
}


public class InheritingBehaviour implements Make, Model {

    public String getMakeAndModel() {
        return Make.super.make()+ " / " +Model.super.model();
    }

    public static void main(String[] args) {
        String makeAndModel = new InheritingBehaviour().getMakeAndModel();
        System.out.println(makeAndModel);
    }
}
