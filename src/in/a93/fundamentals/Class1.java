package in.a93.fundamentals;

// Single line comment

// java.util is a package and Scanner is a class inside that package
// For reading passwords from the console use Console class instead of scanner
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CompletionService;

import in.a93.fundamentals.Employee;
import in.a93.fundamentals.Chapter4;
import in.a93.fundamentals.Chapter5;
import javax.swing.text.AttributeSet;
import in.a93.fundamentals.Ch5Employee;
import in.a93.fundamentals.Ch5Manager;

/**
 * Very important
 * multi line
 * comment
 */
public class Class1 {
    public enum Test {Test1, Test2, Test3};

    public static final String CLASS_FINAL;

    static {
        CLASS_FINAL = "This is a class level constant";
    }

    public static void main(String[] args) {
        System.out.println("We are in the main block\n");

        // Parsing the CLI arguments
        if ((args.length != 0) && (args[0].equals("-g"))) {
            System.out.println("Goodbye, cruel world!!");
        }


        
        // Enumeration classes
//        System.out.println(Ch5Person.a.getAbb());
        // Arrays of primitive types are also class objects that extends Object class
//        int[] a = new int[3];
//        char[] b = new char[3];
//        boolean[] c = new boolean[3];
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(c));
//        System.out.println(a.toString());
//        System.out.println(b.toString());
//        System.out.println(c.toString());

//        System.out.println((a instanceof Object) + " " + a.getClass());
//        System.out.println((b instanceof Object) + " " + b.getClass());
//        System.out.println((c instanceof Object) + " " + c.getClass());
//        var persons = new Ch5Person[2];
//        persons[0] = new Ch5Student("MyName", "My Description");
//        persons[1] = new Ch5Student("YourName", "Your Description");

        // Here the temp var person never refers to the Ch5Person object
        // because it is impossible to define a Ch5Person object (it is abstract)
        // It always refers to the Ch5Student type where the methods are defined
        // If the abstract methods were omitted from the abstract class
        // following expression couldn't have been possible because the compiler
        // ensures that we can only call methods that are available in the class
//        for (Ch5Person person : persons) {
//            System.out.println("Class of temp var is: " + person.getClass());
//            System.out.println(person.getName() + " " + person.getDescription());
//        }
//        Ch5Manager a = new Ch5Manager(5000, 2000);
//        Ch5Employee b = new Ch5Employee(5000);
//        if (a instanceof Ch5Employee) {
//            System.out.println("Object of type manager is instance of type employee");
//        } else {
//            System.out.println("Object of type manager is not instance of type employee");
//        }
//        if (b instanceof Ch5Manager) {
//            System.out.println("Object of type employee is instance of type manager");
//        } else {
//            System.out.println("Object of type employee is not instance of type manager");
//        }
//        a.test_method();
//        Ch5Manager.test_method();
//        Ch5Employee.test_method();
//        Ch5Employee emp = new Ch5Employee(2000);
//        Ch5Manager manager = new Ch5Manager(15000, 5000);

//        System.out.println("Creating manager array:");
//        Ch5Manager[] manager_array = new Ch5Manager[2];
//
//        System.out.println("Assign manager_array to emp_array:");
//        Ch5Employee[] emp_array = manager_array;
//
//        System.out.println("Create new employee type object and assign to emp_array[0]:");

        // Throws ArrayStoreException because the emp_array[0] refers to Manager type
        // which is a subclass of employee type
        // We can assign a subclass object to a superclass variable but not vice versa
        //        emp_array[0] = new Ch5Employee(15000);

//        System.out.println("Getting class of emp_array[0]:");
//        emp_array[0].getClass();
//        System.out.println("Getting class of manager_array[0]:");
//        manager_array[0].getClass();
//        System.out.println("Assign manager type object to manager_array[1]:");
//        manager_array[1] = new Ch5Manager(15000, 2000);
//        System.out.println("Get salary for manager_array[1] using getSalaryWithBonus():");
//        manager_array[1].getSalaryWithBonus();
//        System.out.println("Check the class of emp_array[1]:");
//        emp_array[1].getClass();
//        Chapter5 a = new Chapter5("Plutonian", "FooBar", 15);
//        Chapter5 a = new Chapter5();
//        a.printInfo();
//        System.out.println("Name from inherited function: " + a.getName());
//        System.out.println("Distance from office from inherited function: " + a.getDistanceFromOffice());

//        ConstructorExample yo = new ConstructorExample();
//        ConstructorExample yoyo = new ConstructorExample("Bello");
//        ConstructorExample yoyoyo = new ConstructorExample("Jhinga", "Lala");
//        Employee a = new Employee("a", 2222, 2019, 01, 02);
//        Employee b = new Employee("b", 3333, 2020, 02, 03);

//        System.out.println("Employee info before change:");
//        CallByReference.printInfo(a, b);
//        CallByReference.swap(a, b);
//        System.out.println("Employee info after change:");
//        CallByReference.printInfo(a, b);
//        Static.testStatic();
//        System.out.println(Employee.val);
//        var emp1 = new Employee("Employee 1", 5_000_000.0D, 2019, 04, 01);
//        emp1.getId();
//        var emp2 = new Employee("Employee 1", 5_000_000.0D, 2019, 04, 01);
//        emp2.getId();

//        var emp1 = new Employee("Employee 1", 5_000_000.0D, 2019, 04, 01);
//        Employee emp2 = new Employee("Employee 1", 4_000_000.9D, 2020, 03, 02);
//
//        System.out.println("Are the two employee names same?" + emp1.equals(emp2));
//        Employee.test();
//        Chapter4.printCalendar();
//        Chapter4.localDate();
//        Chapter4.date();
//        Chapter4.test();
//        System.out.println("Hellooooo!!!, World\n");
//        numbers();
//        stringsNChars();
//        final_method();
//        enumerate_example();
//        math_examples();
//        readInput();
//        print_formatting();
//        read_file();
//        write_file();
//        utilities();
//        if_statements();
//        while_loops();
//        do_while_loops();
//        for_loops();
//        continue_statement();
//        arrays();
//        multi_dim_arrays();
    }

    public static void multi_dim_arrays() {
        // Declaration
        int[][] integer_array;

        // Initialization
        integer_array = new int[10][10];

        for (int i = 0; i < integer_array.length; i++) {
            for (int j = 0; j < integer_array[i].length; j++) {
                integer_array[i][j] = (int) (Math.random() * 100);
            }
        }

        // Access
        for (int[] array: integer_array) {
            System.out.println(Arrays.toString(array));
        }
    }
    public static void arrays() {
        // Declaration of arrays
        int[] a;

        // Initialize an array
        a = new int[] {2, 3, 5, 7};
        int[] b = {11, 13, 17, 19};
        int[] c = new int[100]; // Array declared and initialized with 100 0's

        String[] d = new String[10]; // All elements are null values

        for (int i = 0; i < 100; i++) {
            c[i] = i;
        }

        // Access individual elements
        System.out.printf("5th element of the array is: %d\n", c[4]);
        System.out.printf("15th element of the array is: %d\n", c[14]);
        System.out.printf("45th element of the array is: %d\n", c[44]);
        System.out.printf("95th element of the array is: %d\n", c[94]);

        // Other operations
        System.out.printf("The length of the array is: %d\n", d.length);

        // "for each" loop
        System.out.println("Printing the elements of the array using the for loop for iterables");
        for (int i: c) {
            System.out.print(i + " ");
        }

        // "toString" method of arrays
        System.out.println("\nPrinting the array using the toString method");
        System.out.println(Arrays.toString(c));

        // copying an array
        // shallow copy
        int[] shallowCopy = c;

        // deep copy, the 2nd argument can be used to increase the length of new array
        int[] deepCopy = Arrays.copyOf(c, c.length);
    }
    public static void continue_statement() {
        for (var i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            Scanner in = new Scanner(System.in);
            if (in.nextInt() == -1) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
    public static void for_loops() {
        int a = 10;

        System.out.println("Counting from 0..10");
        for (int i = 0; i <= a; i++) {
            System.out.print(" " + i);
        }
    }
    public static void do_while_loops() {
        int a = 5;
        int val = 1;

        do {
            val = val * a;
            a--;
        } while (a > 0);

        System.out.printf("The factorial of 5, using do-while loop is %d", val);
    }
    public static void while_loops() {
        int a = 5;
        int val = 1;

        while (a > 0) {
            val = val * a;
            a--;
        }

        System.out.printf("The factorial, using while loop, of 5 is %d", val);
    }
    public static void if_statements() {
        int a = 20;

        if (a > 30) {
            System.out.println("The number is greater than 30");
        } else if (a < 20) {
            System.out.println("The number is smaller than 20");
        } else {
            System.out.printf("The number is %+d", a);
        }
    }
    public static void utilities() {
        // Get current working directory
        System.out.println(System.getProperty("user.dir"));
    }
    public static void write_file() {
        System.out.println("Provide the file path to write to: ");
        Scanner user_input = new Scanner(System.in);
        String file_path = user_input.nextLine();

        try {
            PrintWriter file_writer = new PrintWriter(file_path);
            file_writer.println("This file has been written to from IntelliJ IDEA!");
            file_writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void read_file() {
        System.out.println("Provide the file path: ");
        Scanner user_input = new Scanner(System.in);

        String file_path = user_input.nextLine();

        user_input.close();

        Scanner file_pointer = null;
        try {
            file_pointer = new Scanner(Path.of(file_path));
            System.out.println(file_pointer.nextLine());
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
    public static void print_formatting() {
        System.out.printf("This floating point number is printed correct: %2.2f\n", 12.02F);
        System.out.printf("%,+0(8d\n", -12345);
        String message = String.format("This time we are taking %1$d inputs using format specifiers and \n\tbuilding a string using %2$s", 2, "String.format");
        System.out.println(message);
    }
    public static void readInput() {
        Scanner input_value = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = input_value.nextLine();
        System.out.println("How many hours do you work everyday?");
        int workHours = input_value.nextInt();
        System.out.println("Hey " + name + ", you work for " + workHours + " hours");
    }
    public static void numbers() {
        byte b = -5;
        int a = 0;
        short c = -32_767;
        long d = -495_848_383_948L;

        System.out.println("--------------------------");
        System.out.println("We are in the numbers block\n");

        System.out.println("This is a byte: " + b);
        System.out.println("This is an int: " + a);
        System.out.println("This is a short: " + c);
        System.out.println("This is a long: " + d);

        System.out.println("This is a float that doesn't print correctly: " + 1_000_000.004F);
        System.out.println("This is a double precision value that doesn't print correctly: " + 1_000_000.00000000000004D);

    }
    public static void stringsNChars() {
        char a = '\u2122';
        String b = "\u03c0";
        System.out.println("----------------------");
        System.out.println("We are in string block\n");

        // Unicode and escape characters
        System.out.println("\\u2122 denotes: " + a);
        System.out.println("This is a string with single char: " + b);
        System.out.println("This will not be printed completely\b\b\b\b\b");
        boolean char_type = Character.isJavaIdentifierStart('a');

        // Substrings
        String m = "lskjflsdjfdlj dk jlkdjfj slkjlsj lkajlkjsdlk jdlkjlkdsjfl kjsdl j";
        String s = m.substring(5, 10);
        System.out.println("Sbustring of string m is: " + s);

        // String equality
        System.out.println("String equality test: " + s.equals("lsdkjflkdjfldjf"));
        System.out.println("Case agnostic string equality test: " + "Hello".equalsIgnoreCase("hello"));

        // Null and empty
        String foo; // null
        foo = "";
        System.out.println("Is it an empty string? " + (foo.length() == 0));

        // Code points (CP) and code units (CU)
        // CP consists of CU; .length method counts CU
        // use .getCodePointCount method for exact code point count
        String bar = "\u15D46";
        System.out.println(bar);

        // StringBuilder class
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(',');
        builder.append(" World!");
        builder.setCharAt(0, 'B');
        String builtText = builder.toString();
        System.out.println("Built text is: " + builtText);
    }
    public static void final_method() {
        System.out.println("In the final method block");
        System.out.println("This is a class constant: " + CLASS_FINAL);
    }
    public static void enumerate_example() {
        Test foo = Test.Test1;
        System.out.println(foo);
    }
    public static void math_examples() {
        // Explicit typecase from double (return type of Math.sqrt) to int (the required value)
        int sqrt = (int) Math.sqrt(4);
        System.out.println(sqrt);
    }
}
