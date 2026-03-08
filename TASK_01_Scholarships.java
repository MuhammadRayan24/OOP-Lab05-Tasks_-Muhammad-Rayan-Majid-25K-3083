import java.util.Scanner;

public class TASK_01_Scholarships {
    static void main() {
        float marks[] = new float[12];
        float sum=0;
        int fullCount=0;
        int halfCount=0;
        int noCount=0;
        float avg;
        int belowAvg=0;

        Scanner sc = new Scanner(System.in);

        for (int i=0 ; i<=11 ; i++){
            System.out.println("Enter the marks of Student " + (i+1) );
            marks[i] =sc.nextFloat();

            //for sum
            sum+=marks[i];
        }

        //for average
        avg=sum/12;

        for (int i=0 ; i< marks.length ; i++) {

            //grace marks
            if (marks[i] < 40)
            {
                marks[i] = 40;
            }

            //for full scholarship
            if (marks[i] > 85)
            {
                fullCount++;
            }

            //for half scholarship
            else if (marks[i] >= 70 && marks[i]<=85)
            {
                halfCount++;
            }

            //for no scholarship
            else {
                noCount++;
            }

            //for below average
            if (marks[i]<avg)
            {
                belowAvg++;
            }
        }

        //Displaying Results
        System.out.println("Class Average: " + avg);
        System.out.println("Number Of Students with Full Scholarships: " + fullCount);
        System.out.println("Number Of Students with Half Scholarships: " + halfCount);
        System.out.println("Number Of Students with No Scholarships: " + noCount);
        System.out.println("Number Of Students with below average: " + belowAvg);
    }
}