package abstraction.execution;

public class Concrete {

    public static final Interface INTERFACE = () -> {
        System.out.println("Incomplete method of class Concrete");
    };

    public static final Operation OPERATION = (a, b) -> a + b;

    public static final Maths MATHS = (a, b) -> {
        return "Addition of " + a + " and " + b + " is: " + (a + b);
    };
}