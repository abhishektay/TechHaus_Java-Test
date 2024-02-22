import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Input the strings
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        
        // Sort the strings by length and then alphabetically
        Arrays.sort(strings, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        
        // Output the sorted strings
        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        
        scanner.close();
    }
}

