package in.a93.fundamentals;

public class Ch5SuperSet {
    private String name;
    private int distanceFromOffice;

    public Ch5SuperSet() {
        System.out.println("This is no argument super constructor");
        this.name = "No name";
        this.distanceFromOffice = 5;
    }

    public Ch5SuperSet(String name, int distanceFromOffice) {
        this.name = name;
        this.distanceFromOffice = distanceFromOffice;
    }

    public String getName() {
        return this.name;
    }

    public int getDistanceFromOffice() {
        return this.distanceFromOffice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistanceFromOffice(int distanceFromOffice) {
        this.distanceFromOffice = distanceFromOffice;
    }
}
