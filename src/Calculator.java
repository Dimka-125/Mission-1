import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (a, b) -> a + b;
    BinaryOperator<Integer> minus = (a, b) -> a - b;
    BinaryOperator<Integer> multiply = (a, b) -> a * b;
    BinaryOperator<Integer> divide = (a, b) -> {
        if (b == 0) throw new ArithmeticException("Нельзя делить на 0");
        return a / b;
    };

    UnaryOperator<Integer> pow = (a) -> a * a;
    UnaryOperator<Integer> abs = a -> a > 0 ? a : a - 1;

    Predicate<Integer> isPositive = a -> a > 0;

    Consumer<Integer> println = System.out::println;

}
