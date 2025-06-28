package $1_Basic_class;

import java.util.Scanner;

public class _7_ReadCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char character = sc.next().charAt(0);

        System.out.println("Character is: " + character);
    }
}
