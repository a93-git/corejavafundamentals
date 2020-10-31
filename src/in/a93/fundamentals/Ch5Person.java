package in.a93.fundamentals;

public abstract class Ch5Person {
    public enum Size {
        SMALL("S"), MEDIUM("M");
        private String abb;

        private Size(String abbreviation) {
            this.abb = abbreviation;
        }

        public String getAbb() {
            return this.abb;
        }
    }

    public static Size a = Size.SMALL;

    private String name;

    Ch5Person(String name) {
        this.name = name;
    }

    public String getName() {
        return  this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getDescription();
    public abstract void setDescription(String description);
}
