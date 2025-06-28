package Basic_class;

// Everything in java is written in class
// class:- a user defined blueprint consisting of attributes and methods (functions)
// object:- instance of the class

public class FirstClass {
    // this is the function that return nothing, main is the function name, and it is the entry point
    // public is access modifier, visible everywhere
    // static -> we can call the method without creating an object
    // list of strings
    public static void main(String[] args) {
        System.out.print(args[0]); // will print the argument given while executing, will showing only first string
        System.out.println("Hello world"); // println will print in new line
        // System -> class
        // out -> object of Print stream
        // println -> method in print stream
    }
}