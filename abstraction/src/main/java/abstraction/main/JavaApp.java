package abstraction.main;

import abstraction.execution.Concrete;
import abstraction.execution.MyThread1;
import abstraction.execution.MyThread2;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaApp {

    public static void execution() {

        
        Concrete.INTERFACE.incompleteMethod();

        int result = Concrete.OPERATION.operate(10, 2);
        System.out.println(result);

        String output = Concrete.MATHS.add(11.1, 22.2);
        System.out.println(output);

        
        MyThread1.thread.start();
        MyThread2.thread.start();
        
        Consumer<String> consumer = (String s) -> {
            System.out.println("Hello " + s + "!");
        };

        consumer.accept("Raja");
        
        Predicate<Integer> isEvenPositive =( n) -> (n > 0)&&(n % 2 == 0);
        System.out.println(isEvenPositive.test(-12));
    }
}