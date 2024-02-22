import java.util.Scanner;

public class OverflowChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        // Check for addition overflow
        boolean addOverflow = false;
        try {
            Math.addExact(num1, num2);
        } catch (ArithmeticException e) {
            addOverflow = true;
        }
        
        // Check for multiplication overflow
        boolean mulOverflow = false;
        try {
            Math.multiplyExact(num1, num2);
        } catch (ArithmeticException e) {
            mulOverflow = true;
        }
        
        // Output the result
        if (addOverflow) {
            System.out.println("Adding the two integers will result in overflow.");
        } else {
            System.out.println("Adding the two integers will not result in overflow.");
        }
        
        if (mulOverflow) {
            System.out.println("Multiplying the two integers will result in overflow.");
        } else {
            System.out.println("Multiplying the two integers will not result in overflow.");
        }
        
        scanner.close();
    }
}

