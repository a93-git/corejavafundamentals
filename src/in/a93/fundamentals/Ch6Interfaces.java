package in.a93.fundamentals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch6Interfaces extends Ch5Employee implements Comparable<Ch5Employee> {

    public Ch6Interfaces(int salary) {
        super(salary);
    }

    public int compareTo(Ch5Employee emp) {
        return Double.compare(this.getSalary(), emp.getSalary());
    }

    public String toString() {
        return getClass().getName() + " " + this.getSalary();
    }
}

class Ch6CallBack implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("This is orverridden actionPerformed method of interface ActionListener");
        System.out.println("The methods available to the event are: " + e.getClass().getMethods());
        System.out.println("Event value is: " + e.toString());
    }
}
