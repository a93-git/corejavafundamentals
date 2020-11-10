package in.a93.fundamentals;

import java.util.Arrays;

public class Ch6Lambda {

    String[] a = new String[] {"slkdjflksdjf", "lksdjf", "lksdflksdfjlksdjf", "abhishek"};

    public void print_everything() {
        System.out.println(Arrays.toString(a));
        System.out.println("Sorted alphabetically:");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Sorted length-wise");

        // Lambda expression in below statement
        Arrays.sort(a, (String f, String s) -> f.length() - s.length());

        System.out.println(Arrays.toString(a));
        }
    }

