import java.util.Scanner;

public class N7_Questions {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("if the input is: "); // 20 physics wallah

            int p = s.nextInt();
            String q = s.next();

            System.out.print(p);
            System.out.println(q);
        }

        

        // Result is:- 20physics

        Scanner sc = new Scanner(System.in);

        System.out.println("if the input is: "); // hello world 21

        String x = sc.next();
        int y = sc.nextInt();

        System.out.print(x + y);

        // Result is:- InputMismatchException.
    }
}