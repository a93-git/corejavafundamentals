package in.a93.fundamentals;

public class ConstructorExample {

    private static int foo;

    // Static initialization block
    static {
        foo = 1;
    }
    // Arbitrary block of code
    // Any initialization block like this, placed anywhere in the class def will
    // be executed before any constructor is executed

    // Object initialization block
    {
        System.out.println("This is an arbitrary block of code");
        foo++;
        System.out.println(foo);
    }

    // Constructor overloading and calling another constructor
    public ConstructorExample() {
        this("World!");
        System.out.println("This is constructor 1");
    }

    // Arbitrary block of code 2
    // This block will be called before any other constructor is executed
    {
        System.out.println("This is an arbitrary block of code 2");
    }

    public ConstructorExample(String string) {
        this("Hello", string);
        System.out.println("This is constructor 2");
    }

    public ConstructorExample(String string1, String string2) {
        System.out.println(string1 + " " + string2 + "!");
        System.out.println("This is constructor 3");
    }

    // Arbitrary block of code 3
    // This block will be called before any other constructor is executed
    {
        System.out.println("This is an arbitrary block of code 3");
    }
}