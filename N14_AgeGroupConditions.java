import java.util.Scanner;

public class N14_AgeGroupConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age <= 12) {
            System.out.println("Child");
        } else if (age > 12 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        int num = sc.nextInt();

        String ans;
        ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);
    }
}

