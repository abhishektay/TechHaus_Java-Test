import java.util.Scanner;

public class TimeStringConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the time string
        System.out.print("Enter the time string (e.g., '4h 20m 10s'): ");
        String timeString = scanner.nextLine();
        
        // Split the time string into components
        String[] components = timeString.split("\\s+");
        
        int totalSeconds = 0;
        
        // Process each component and add to total seconds
        for (String component : components) {
            if (component.endsWith("h")) {
                int hours = Integer.parseInt(component.substring(0, component.length() - 1));
                totalSeconds += hours * 3600;
            } else if (component.endsWith("m")) {
                int minutes = Integer.parseInt(component.substring(0, component.length() - 1));
                totalSeconds += minutes * 60;
            } else if (component.endsWith("s")) {
                int seconds = Integer.parseInt(component.substring(0, component.length() - 1));
                totalSeconds += seconds;
            }
        }
        
        // Print the total number of seconds
        System.out.println("Total number of seconds: " + totalSeconds);
        
        scanner.close();
    }
}

