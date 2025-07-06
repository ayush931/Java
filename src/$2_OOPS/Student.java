package $2_OOPS;

public class Student {
    String name;
    public int roll;    // public -> can be access from different package
    double percentage;  // default -> can be access only in same package
    private int section;   // cannot access it beyond the curly braces

    // Getter -> getting the access to the private attribute of the class
    public int getSection() {
        return section;
    }

    // Setter -> setting the value of the private attribute section
    public void setSection(int sectionNum) {
        section = sectionNum;
    }
}
