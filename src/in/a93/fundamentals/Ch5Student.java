package in.a93.fundamentals;

import java.util.Objects;

public class Ch5Student extends Ch5Person {
    private String name;
    private String description;

    Ch5Student() {
        super("Default name");
        this.description = "Default description";
    }

    Ch5Student(String description) {
        super("Default name");
        this.description = description;
    }

    Ch5Student(String name, String description) {
        super(name);
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public String getDescription() {
        return this.description;
    }

}
