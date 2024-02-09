public class N12_unaryOperators {
    public static void main(String[] args) {
        int p = 5, q = 5;

        System.out.println(p++); // 5
        System.out.println(p); // 6

        System.out.println(++q); // 6
        System.out.println(q); // 6

        int x = p++;
        int y = ++q;

        System.out.println(x); // 6
        System.out.println(y); // 7

        System.out.println(p); // 7
        System.out.println(q); // 7

        System.out.println(4 + 2 + "pqr");
        System.out.println("pqr" + 4 + 2);

        boolean a = false;
        boolean b = false;
        boolean c = true;

        System.out.println(a == b == c);
    }
}

// Java Unary Operations

/*
* Unary plus (+)
* Unary minus (-)
* Increment Operator (++)
* Decrement Operator (--)
* Logical Complement Operator (!)
* Post - Increment Operator
* Pre - Increment Operator
*/