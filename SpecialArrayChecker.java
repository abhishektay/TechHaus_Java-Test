import java.util.Scanner;

public class SpecialArrayChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize a 3x3 array
        int[][] array = new int[3][3];
        
        // Input values into the array
        System.out.println("Enter values into the 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate sum of even and odd elements
        int sumEven = 0;
        int sumOdd = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element % 2 == 0) {
                    sumEven += element;
                } else {
                    sumOdd += element;
                }
            }
        }
        
        // Check if the array is special
        if (sumEven == sumOdd) {
            System.out.println("The array is special.");
        } else {
            System.out.println("The array is not special.");
        }
        
        scanner.close();
    }
}

