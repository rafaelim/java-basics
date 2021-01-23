# Java Basics

## This repository shows some basics examples about:
### Functions 
#### Consumer
A simple example using a Consumer from java Functions, here we receive a name and print a hello message:
```java
Consumer<String> sayHello = (name) -> System.out.println("Hello, " + name);

sayHello.accept("John");
```
#### Function
A simple example using a Function from java Functions, here we receive a list of numbers and return the first even number:
```java
List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
Function<List<Integer>, Integer> findFirstEvenNumber = list -> {
    return list.stream().filter(it -> it % 2 == 0).findFirst().get();
};

findFirstEvenNumber.apply(integerList);
```
#### Predicate
A simple example using a Predicate from java Functions, here we receive a number and check if it is even:
```java
Predicate<Integer> isEven = (number) -> number % 2 == 0;

isEven.test(9);
```
#### Supplier
A simple example using a Supplier from java Functions, we will return a list of numbers:
```java
Supplier<List<Integer>> supplierIntegerList = () -> Arrays.asList(1,2,3,4);

supplierIntegerList.get();
```
### Interfaces
An example of FunctionalInterface, here we can also see some examples of static and default methods inside an Interface:
```java
@FunctionalInterface
interface Employee {
    Employee find(int id);

    default boolean isExec(int id) {
        return true;
    }

    static String getDefaultState() {
        return "SP";
    }

}
```
### Lambda expressions
A simple lambda expression example, the method will receive a name, and a lambda function to print a hello message:
```java
@FunctionalInterface
interface Greeting {
    public String sayHello(String name);
}

public void testGreeting(String name, Greeting greeting) {
    String result = greeting.sayHello(name);
    System.out.println("Result: "+ result);
}

testGreeting("John", (String name) -> "Hello, "+ name);
```
### Optional type
Using Optional type we can handle easier the possibles null values in our code:
```java
// attendeesOptional
List<Integer> integerList = Arrays.asList(1,2,3,4,5);
Optional<Integer> result = integerList.stream().reduce(Integer::sum);
System.out.println(result.get());

// nonAttendeesOptional
List<Integer> integerList = Collections.emptyList();
Optional<Integer> result = integerList.stream().reduce(Integer::sum);
if(result.isPresent()) {
    System.out.println(result.get());
}
```
### Stream
A stream example to filter all the even numbers from a list and then print it out:  
```java
// print only the even numbers
List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

integerList.stream()
    .filter(it -> it % 2 == 0)
    .forEach(System.out::println);
```