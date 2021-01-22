package com.rafael.j8.basics.lambda;

public class MethodReferences {

    interface Movie {
        public boolean check(int d);
    }

    public static boolean isClassic(int movieId) {
        return movieId > 100 ? true : false;
    }

    public boolean isComedy(int movieId) {
        return movieId < 100 ? true : false;
    }

    public void testMovie(int movieId) {
        MethodReferences methodReferences = new MethodReferences();

        Movie m1 = methodReferences::isComedy;
        Movie m2 = MethodReferences::isClassic;

        System.out.println("isComedy? = "+ m1.check(movieId));
        System.out.println("isClassic? = "+ m2.check(movieId));
    }

    public static void main(String[] args) {
        MethodReferences methodReferences = new MethodReferences();
        methodReferences.testMovie(90);
        methodReferences.testMovie(101);
    }
}
