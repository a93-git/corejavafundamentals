package in.a93.fundamentals;

public class Ch5Employee {
    private int salary;

    public static void test_method() {
        System.out.println("This is a static method in superclass");
    }
    public Ch5Employee(int salary) {
        this.salary = salary;
        System.out.println("This is super class");
    }

    public int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }
}
