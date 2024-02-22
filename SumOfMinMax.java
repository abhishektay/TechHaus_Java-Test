import java.util.Arrays;
import java.util.Scanner;

public class SumOfMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
         int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
         int min = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
        int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
         int sum = min + max;
        System.out.println("Sum of the smallest and largest numbers: " + sum);
        
        scanner.close();
    }
}

