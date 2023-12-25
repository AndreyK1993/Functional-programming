package task01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<String> consumer = name ->
                System.out.println("Name is " + name);

        List<String> names = Arrays.asList("Tom", "Alice", "Bob", "Lucy");

        for (String name : names) {
            consumer.accept(name);
        }
    }
}
