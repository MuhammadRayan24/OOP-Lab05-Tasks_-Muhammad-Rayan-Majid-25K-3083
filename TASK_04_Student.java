import java.util.ArrayList;
import java.util.Scanner;

public class TASK_04_Student
{
    String name;
    double gpa;

    TASK_04_Student(String name, double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<TASK_04_Student> students = new ArrayList<>();

        System.out.println("Enter details of 5 students");

        // Adding students
        for (int i = 0; i < 5; i++)
        {

            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.next();

            System.out.print("Enter GPA of student " + (i + 1) + ": ");
            double gpa = sc.nextDouble();

            TASK_04_Student s = new TASK_04_Student(name, gpa);
            students.add(s);
        }

        // Removing students with GPA below 2.0
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).gpa < 2.0) {
                students.remove(i);
                i--;
            }
        }

        // Checking if list is empty
        if (students.size() == 0) {
            System.out.println("No students left after removing low GPA students.");
            return;
        }

        // Finding topper
        TASK_04_Student topper = students.get(0);

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).gpa > topper.gpa) {
                topper = students.get(i);
            }
        }

        // Counting Deans List students
        int deanCount = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).gpa > 3.5) {
                deanCount++;
            }
        }

        // Output results
        System.out.println("\nTopper Student: " + topper.name + " (GPA: " + topper.gpa + ")");
        System.out.println("Number of students in Dean's List: " + deanCount);

        sc.close();
    }
}