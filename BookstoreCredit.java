import java.util.Scanner;


/**
 * BookstoreCredit
 */
public class BookstoreCredit {

    // Create method that calculates bkstrCrdt and displays data fields to user
    public static float moneyOff(float g, int c) {
        float dollarsOff = g * c;
        return dollarsOff;
    }

    public static void main(String[] args) {
        // Variables and Constants
        String student;
        float gpa;
        int calcCredit = 10;
        float bookCredit;

        Scanner kbd = new Scanner (System.in);

        // Prompt User for student name and store in variable
        System.out.print("Please enter Student Name:  ");
        student = kbd.nextLine();
        // Prompt User for Student GPA and store in a variable
        System.out.print("Please enter Student GPA: ");
        gpa = kbd.nextFloat();

        bookCredit = moneyOff(gpa, calcCredit);
    
        System.out.println(student + " has a Grade Point Average of " + gpa + "." + student + " has earned a Book store credit of $" + bookCredit + ".");
    }
}
