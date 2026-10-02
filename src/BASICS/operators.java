package BASICS;

public class operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        System.out.println("+a = " + (+a));
        System.out.println("-a = " + (-a));
        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("--a = " + (--a));
        System.out.println("a-- = " + (a--));

        // 3. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 4. Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        // 5. Assignment Operators
        int c = 10;

        System.out.println("\n=== Assignment Operators ===");
        c += 5;
        System.out.println("c += 5 : " + c);

        c -= 2;
        System.out.println("c -= 2 : " + c);

        c *= 2;
        System.out.println("c *= 2 : " + c);

        c /= 2;
        System.out.println("c /= 2 : " + c);

        c %= 3;
        System.out.println("c %= 3 : " + c);

        // 6. Bitwise Operators
        int p = 5;  // 0101
        int q = 3;  // 0011

        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("p & q : " + (p & q));
        System.out.println("p | q : " + (p | q));
        System.out.println("p ^ q : " + (p ^ q));
        System.out.println("~p    : " + (~p));

        // 7. Shift Operators
        System.out.println("\n=== Shift Operators ===");
        System.out.println("p << 1 : " + (p << 1));
        System.out.println("p >> 1 : " + (p >> 1));
        System.out.println("p >>> 1: " + (p >>> 1));

        // 8. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);

        // 9. instanceof Operator
        System.out.println("\n=== instanceof Operator ===");
        String name = "Kanishka";
        System.out.println("name instanceof String : "
                + (name instanceof String));
    }
}