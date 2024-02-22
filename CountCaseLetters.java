import java.util.Scanner;

public class CountCaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }
        
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
        
        if (uppercaseCount == lowercaseCount) {
            System.out.println("The string contains an equal number of uppercase and lowercase letters.");
        } else {
            System.out.println("The string does not contain an equal number of uppercase and lowercase letters.");
        }
        
        scanner.close();
    }
}
