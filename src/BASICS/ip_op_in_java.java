package BASICS;
import java.util.Scanner;

public class ip_op_in_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Output
        System.out.println("=== Java Input and Output ===");

        // String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Decimal input
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        // Output
        System.out.println("\n=== Your Details ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        sc.close();
    }
}

