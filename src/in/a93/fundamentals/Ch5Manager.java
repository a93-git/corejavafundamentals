package in.a93.fundamentals;

public class Ch5Manager extends Ch5Employee {
    private int salary;
    private int bonus;

    public static void test_method() {
        System.out.println("This is a static method in the subclass");
    }

    public Ch5Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
        System.out.println("This is sub class");
    }

    public int getSalaryWithBonus() {
        return super.getSalary() + this.bonus;
    }

    public int getSalary() {
        return 2;
    }
}
