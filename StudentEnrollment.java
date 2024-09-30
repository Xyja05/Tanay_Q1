import java.util.Scanner;

public class StudentEnrollment {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Declare variables to store student information
    String studentName;
    String course;
    String courseCode;
    int numUnits;
    int totalFee;
    int paymentAmount;

    // Input student information
    System.out.print("Enter student name: ");
    studentName = scanner.nextLine(); //Read student name

    System.out.print("Enter course: ");
    course = scanner.nextLine(); //Read course name

    System.out.print("Enter course code: ");
    courseCode = scanner.nextLine(); //Read course code

    System.out.print("Enter number of units (max 10): ");
    numUnits = scanner.nextInt(); //Read number of units
    scanner.nextLine(); // consume newline left-over

    // Compute total enrollment fee
    totalFee = numUnits * 1000; //Calculate total fees based on units

    // Output student information and total fee
    System.out.println("Student Name: " + studentName); //Display student name
    System.out.println("Total Enrollment Fee: " + totalFee); //Display total fee

    // Ask for payment amount
    System.out.print("Enter payment amount: ");
    paymentAmount = scanner.nextInt();
    scanner.nextLine(); // consume newline left-over

    // Determine payment status
    if (paymentAmount == totalFee) {
      System.out.println("Fully Paid"); //Payment is complete
    } else if (paymentAmount < totalFee) {
      System.out.println("Partial Payment: " + paymentAmount); //Payment is partial
    } else {
      System.out.println("Overpayment: " + (paymentAmount - totalFee)); //Payment exceeds total fee
    }
  }
}