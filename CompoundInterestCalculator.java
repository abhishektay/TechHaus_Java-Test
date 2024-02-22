import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input principal amount, yearly rate of interest, and number of months
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the yearly rate of interest (in percentage): ");
        double yearlyRate = scanner.nextDouble();
        
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();
        
        // Convert yearly rate of interest to monthly rate
        double monthlyRate = yearlyRate / 12 / 100;
        
        // Calculate total interest earned
        double totalInterest = principal * (Math.pow(1 + monthlyRate, months) - 1);
        
        // Print the total interest earned in Rupees
        System.out.println("Total interest earned: ₹" + totalInterest);
        
        scanner.close();
    }
}
