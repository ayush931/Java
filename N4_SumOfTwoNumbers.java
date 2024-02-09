import java.util.Scanner;

public class N4_SumOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int num1 = sc.nextInt();

            System.out.println("Enter Second number");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("The Sum is: " + sum);
        }
    }
}
