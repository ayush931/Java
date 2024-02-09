// Java Scanner class is used to take input.
// java.util is a library in which "scanner" class is available.

import java.util.Scanner;

public class N3_TakingInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your name");
        String name = sc.next(); // next() will stop reading the string after the space between the liens or sentence.
        System.out.println("Your name is: "  + name);

        System.out.println("Enter your name");
        String na = sc.nextLine(); // nextline() will read between the space.
        System.out.println("Your name is: " + na);
        

        System.out.println("Enter your lucky number");
        int num_1 = sc.nextInt();

        System.out.println("Lucky number is: " + num_1);

    }
}