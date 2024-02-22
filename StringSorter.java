import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
     
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        
    
        Arrays.sort(strings, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        
        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        
        scanner.close();
    }
}

