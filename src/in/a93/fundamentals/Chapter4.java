package in.a93.fundamentals;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Chapter4 {
    public static void test() {
        System.out.println("We are in Chapter4 class");
        System.out.println("This is test class");
    }

    public static void date() {
        Date today = new Date();
        System.out.printf("New date object created, date in string: %s\n", today.toString());
    }

    public static void localDate() {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }

    public static void printCalendar() {
        LocalDate localDate = LocalDate.now();

        // Current month and today's day
        int month = localDate.getMonthValue();
        int today = localDate.getDayOfMonth();

        // 1st of the month
        localDate = localDate.minusDays(today - 1);

        // Get day on the first of the month
        DayOfWeek weekDayOnFirst = localDate.getDayOfWeek();
        int weekDayOnFirst_value = weekDayOnFirst.getValue();

        // Print the header of the calendar
        System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun");
        for (int i = 1; i < weekDayOnFirst_value; i++) {
            System.out.print("     ");
        }

        // Calculate the number of days in the current month
        int numberOfDaysInMonth = localDate.lengthOfMonth();

        // Print the calendar
//        for (int i = 1; i <= numberOfDaysInMonth; i++) {
//            System.out.printf("%5d", i);
//
//            if (i == today) {
//                System.out.print("*");
//            }
//            if (weekDayOnFirst_value % 7 == 0) {
//                System.out.print("\n");
//            }
//            weekDayOnFirst_value++;
//        }

//        Print the calendar
        while (localDate.getMonthValue() == month) {
            System.out.printf("%5d", localDate.getDayOfMonth());

            if (localDate.getDayOfMonth() == today) {
                System.out.print("*"); // star mark in front of today
            }
            if (localDate.getDayOfWeek().getValue() % 7 == 0) {
                System.out.print("\n");
            }
            localDate = localDate.plusDays(1);

        }


    }

}

class Employee {

    // Private instance fields
    // final - once set can't change
    // use final with fields of immutable type e.g. String, LocalDate
    private final String name;
    private double salary;
    private final LocalDate hireDay;
    private final int id;

    // Static fields - mutable
    private static int sharedVal = 1;

    // Static fields - immutable
    public static final double val = 2354;

    // date is a mutable object, setting up final doesn't ensure that it won't change
    private final Date date = new Date();

    // Change the value of final variable with reference to mutable object
    public void test_date_change(){
        System.out.println("Final field before change: " + date);
        date.setMonth(11);
        System.out.println("Final field after change: " + date);

        // Since date is final, the code below is invalid
        // Event though the object referenced to by the date can mutate
        // The date variable will always refer to the same object (but now having mutated value)
//        Date date_2 = new Date();
//        date = date_2;
    }
    // Constructor
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
        this.id = changeSharedValue();
    }

    // Accessor methods
    public void getId() {
        System.out.println("ID is: " + this.id);
        System.out.println("Next ID value is: " + sharedVal);
    }

    public double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    // In accessor methods never return a mutable object
    // If required to return a mutable object, return a clone of it
    public LocalDate getHireDay() {
        return hireDay;
    }

    // @NotNull annotation is required because calling a method on null object
    // throws NullPointerException
    public boolean equals(Employee other) {
        return name.equals(other.name);
    }

    // Mutator method - changes the instance field salary
    public void raiseSalary(double byPercent) {
        salary += raiseSalary_2(byPercent);
    }

    // Private helper method - internal implementation
    // Can be changed/dropped without any impact on existing code (that uses this class)
    private double raiseSalary_2(double byPercent) {
        return (salary * byPercent / 100);
    }

    private int changeSharedValue() {
        var retval = sharedVal;
        sharedVal++;
        return retval;
    }
}

class Static {
    public static void testStatic() {
        System.out.println("TestStatic");
    }

    NumberFormat a = NumberFormat.getCurrencyInstance();
}

class CallByReference {

    // In Java, object references are passed by value
    // Following swap operation will not work as a and b get a copy of the reference
    // The swap operation will take place and variables a and b will exchange hands
    // But this will not change the object references stored in the actual variables
    // (outside this class). The swapping is discarded as soon as the method call
    // finishes
    public static void swap(Employee a, Employee b) {
        Employee temp = a;
        a = b;
        b = a;
    }

    public static void printInfo(Employee a, Employee b) {
        System.out.println(a.getName());
        System.out.println(b.getName());
    }
}

class ConstructorExample {

    // Constructor overloading and calling another constructor
    public ConstructorExample() {
        this("World!");
    }

    public ConstructorExample(String string) {
        this("Hello", string);
    }

    public ConstructorExample(String string1, String string2) {
        System.out.println(string1 + " " + string2 + "!");
    }


}