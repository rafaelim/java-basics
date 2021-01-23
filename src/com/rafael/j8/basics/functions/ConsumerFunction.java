package com.rafael.j8.basics.functions;

import java.util.function.Consumer;

public class ConsumerFunction {

    Consumer<String> sayHello = (name) -> System.out.println("Hello, " + name);
    Consumer<String> sayGoodBye = (name) -> System.out.println("Goodbye, " + name);
    Consumer<String> sayHelloAndThenSayGoodBye = sayHello.andThen(sayGoodBye);
    public static void main(String[] args) {
        new ConsumerFunction().sayHello.accept("John");
        new ConsumerFunction().sayHelloAndThenSayGoodBye.accept("John");
    }
}
