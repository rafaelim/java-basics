package com.rafael.j8.basics.lambda;

public class SimpleExamples {

    interface Greeting {
        public String sayHello(String name);
    }

    interface Email {
        String constructEmail(String name);
    }

    Email email = (String name) -> name + "@email.com";

    public void testGreeting(String name, Greeting greeting) {
        String result = greeting.sayHello(name);
        System.out.println("Result: "+ result);
    }

    public void getEmail(String name, Email email) {
        String result = email.constructEmail(name);
        System.out.println("Email: "+ result);
    }

    public static void main(String[] args) {
	    new SimpleExamples().testGreeting("John", (String name) -> "Hello, "+ name);
        new SimpleExamples().getEmail("John", (String name) -> name + "@email.com");

        new SimpleExamples().testGreeting("Mary", (String name) -> "Hello, "+ name);
        new SimpleExamples().getEmail("Mary", (String name) -> name + "@email.com");

        new SimpleExamples().testGreeting("", (String name) -> !name.isEmpty() ?"Hello, "+ name : "Did you miss something?");
    }
}
