import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the yearly rate of interest (in percentage): ");
        double yearlyRate = scanner.nextDouble();
        
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();
        
        double monthlyRate = yearlyRate / 12 / 100;
        
        double totalInterest = principal * (Math.pow(1 + monthlyRate, months) - 1);
        
        System.out.println("Total interest earned: ₹" + totalInterest);
        
        scanner.close();
    }
}
