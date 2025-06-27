import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double A = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double B = scanner.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String option = scanner.next();
        switch (option) {
            case "add":
                System.out.println("Result: " + (A + B));
                break;
            case "sub":
                System.out.println("Result: " + (A - B));
                break;
            case "mul":
                System.out.println("Result: " + (A * B));
                break;
            case "div":
                if (B != 0) {
                    System.out.println("Result: " + (A / B));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }

        scanner.close();
    }
}