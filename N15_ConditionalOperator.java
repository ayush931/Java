import java.util.Scanner;

public class N15_ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value % 2 == 0 && value % 3 == 0) {
            System.out.println("Found ans - " + value);
        }

        int num = sc.nextInt();

        if (num % 5 == 0 || num % 3 == 0) {
            System.out.println("Found ans -" + num);
        }

    }
}
