package $2_OOPS;

public class _03_Constructor {
    public static void main(String[] args) {
        Students sc = new Students("ayush", 32, 45.98);
//      System.out.println(sc.getNumberOfStudents());
        System.out.println(Students.getNumberOfStudents());
        Students sc1 = new Students("aman", 46, 69.5);
//      System.out.println(sc1.getNumberOfStudents());
        System.out.println(Students.getNumberOfStudents());
        Students sc2 = new Students("ashish", 45, 45.6);
//      System.out.println(sc2.getNumberOfStudents());
        System.out.println(Students.getNumberOfStudents());
        System.out.println(sc.name);
        System.out.println(sc.roll);
        System.out.println(sc.percentage);
    }
}
