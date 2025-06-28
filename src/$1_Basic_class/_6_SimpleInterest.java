package $1_Basic_class;

import java.util.Scanner;

public class _6_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle amount");
        float principle = sc.nextFloat();

        System.out.println("Enter interest rate");
        float interest = sc.nextFloat();

        System.out.println("Enter time");
        float time = sc.nextFloat();

        float simpleInterest = (principle * interest * time) / 100;

        System.out.println("Principle amount is: " + principle);
        System.out.println("Interest rate is: " + interest);
        System.out.println("Time duration is: " + time);
        System.out.println("Simple interest is: " + simpleInterest);
    }
}
