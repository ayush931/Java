import java.util.Scanner;

public class N17_whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int n = sc.nextInt();

        int num = 1;

        while (num <= n) {
            // System.out.println(num);
            sum = sum + num;
            num++;  // Increment operator ++, num = num + 1
        }
        System.out.println(sum);
    }
}

// While loop

/*
* while (condition) {
*  code
* }
*/
