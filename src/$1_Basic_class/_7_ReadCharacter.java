package $1_Basic_class;

import java.util.Scanner;

public class _7_ReadCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char character = sc.next().charAt(0);   // Only taking the character at 0th index from the complete string

        System.out.println("Character is: " + character);
    }
}
