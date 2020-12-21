package lesson9.task3;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class demo2 {
    public static void main(String[] args) {
        UnaryOperator<Integer> getCube =
                (Integer integer) -> {
            return integer * integer *integer;
                };
                System.out.println(getCube.apply(10));
        Consumer<Object> printObject = it -> System.out.println(it);
        printObject.accept(new Object());
    }
}
