import java.util.Scanner;

public class OverflowChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        boolean addOverflow = false;
        try {
            Math.addExact(num1, num2);
        } catch (ArithmeticException e) {
            addOverflow = true;
        }
        
        boolean mulOverflow = false;
        try {
            Math.multiplyExact(num1, num2);
        } catch (ArithmeticException e) {
            mulOverflow = true;
        }
    
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

