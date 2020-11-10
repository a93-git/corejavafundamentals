package in.a93.fundamentals;

public class Ch5Employee implements Cloneable {
    private int salary;

    public Ch5Employee clone() throws CloneNotSupportedException {
        return (Ch5Employee) super.clone();
    }
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

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
