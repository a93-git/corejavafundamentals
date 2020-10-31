package in.a93.fundamentals;

// How does constructors execution take place in case of inheritance?

public class Chapter5 extends Ch5SuperSet {
    private String nationality = "";

    public Chapter5() {
        this.nationality = "Martian";
    }

    public Chapter5(String nationality) {
        this.nationality = nationality;
    }

    // Initializing super class fields
    public Chapter5(String nationality, String name, int distanceFromOffice) {
        super(name, distanceFromOffice);
        this.nationality = nationality;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getName() {
        System.out.println("The name is Name. getName()");
        return super.getName();
    }

    public int getDistanceFromOffice() {
        System.out.println("Distance from office is super");
        return super.getDistanceFromOffice();
    }

    public void printInfo() {
        System.out.println(getName());
        System.out.println("Nationality: " + this.getNationality());
        System.out.println(getDistanceFromOffice());
    }
}
