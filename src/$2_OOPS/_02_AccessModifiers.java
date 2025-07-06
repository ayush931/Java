package $2_OOPS;

// Access modifier
// 1. Public - all packages
// 2. Private - same class
// 3. Default - same packages

public class _02_AccessModifiers {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSection(73);
        System.out.println(s.getSection());
    }
}
