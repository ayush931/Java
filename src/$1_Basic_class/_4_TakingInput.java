package $1_Basic_class;

import java.util.Scanner;

public class _4_TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name");
        String name = sc.next();    // Taking the string as a input from the user, not read the space, cannot take the string after string
        System.out.println("Your name is " + name);

        System.out.println("Enter your lucky number");
        int num1 = sc.nextInt();    // taking the integer as input from the user
        System.out.println("Lucky number is " + num1);

        System.out.println("Enter full name");
        String fullName = sc.nextLine();    // Taking the multiple strings, even after the string
        System.out.println("Your full nane is " + fullName);
    }
}
