import java.util.Arrays;
import java.util.Scanner;

public class SortDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Sort the array in descending order
        Arrays.sort(numbers);
        for(int i = 0; i < size / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[size - i - 1];
            numbers[size - i - 1] = temp;
        }
        
        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}