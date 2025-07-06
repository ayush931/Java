package $2_OOPS;

public class Students {
    String name;
    int roll;
    double percentage;
    final String schoolName = "DAV";    // cannot change this attribute
    private static int numberOfStudents;    // create a single block of attribute for all the objects

    // default constructor
    public Students () {

    }

    // using the static helps to access getter and setter directly through class
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    // constructor
    public Students (String name, int roll, double percentage) {
        this.name = name;
        this.roll = roll;
        this.percentage = percentage;
        numberOfStudents++;     // auto increment the value every time object created with this class
    }
}
