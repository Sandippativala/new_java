import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P15 {//StudentPercentageCalculator
    public static void main(String[] args) {
        String fileName = "students.txt"; // Text file containing student data
        String line;

        System.out.println("Roll No\tName\t\tPercentage");
        System.out.println("------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                // Split the line into fields using tab (\t) as the delimiter
                String[] fields = line.split("\t");

                // Parse data from the fields
                int rollNo = Integer.parseInt(fields[0]);
                String name = fields[1];
                int marks1 = Integer.parseInt(fields[2]);
                int marks2 = Integer.parseInt(fields[3]);
                int marks3 = Integer.parseInt(fields[4]);

                // Calculate total and percentage
                int totalMarks = marks1 + marks2 + marks3;
                double percentage = (totalMarks / 3.0);

                // Print the result
                System.out.printf("%d\t%s\t%.2f%%\n", rollNo, name, percentage);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the file: " + e.getMessage());
        }
    }
}
