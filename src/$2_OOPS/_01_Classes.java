package $2_OOPS;

public  class _01_Classes {
    // creating outside the main function, preferred
    // created the student class in the different file in the same package

    public static void func(String name) {
        System.out.println(name);
        return;
    }

    public static void function(Student x) {
        System.out.println(x.name);
        System.out.println(x.percentage);
        System.out.println(x.roll);
        return;
    }

    // classes are passed by reference
    public static void change(Student x) {
        x.name = "kbp";
    }

    public static void main(String[] args) {
        // creating inside the main function

        class Car {
            String name;
            String model;
            int price;
        }

        String name = "Aman";
        func(name);

        Student s = new Student();
        Car c = new Car();

        // will give the default value if printing before initializing
        System.out.println(s.name); // null
        System.out.println(s.roll); // 0
        System.out.println(s.percentage);   // 0.0

        s.name = "ankit";
        s.roll = 34;
        s.percentage = 34.45;

        function(s);

        // change the value of the attribute of the class through function
        change(s);

        c.name = "Maruti";
        c.model = "ALto";
        c.price = 440000;

        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.percentage);

        System.out.println(c.name);
        System.out.println(c.model);
        System.out.println(c.price);
    }
}