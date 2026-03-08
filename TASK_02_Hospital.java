import java.util.Scanner;

public class TASK_02_Hospital {

    static void main() {
        float temperatures[][] = new float[5][7];
        float avg=0;
        int exceedCount = 0;
        float highestWeekAvg =0;
        int highPatient=0;
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i< temperatures.length ; i++)
        {
            System.out.println("Enter Temperature For Patient " + (i+1) + ":");
            for (int j=0 ; j< temperatures[i].length ; j++)
            {
                System.out.println("Enter Temperature of Day " + (j+1) + " in Fahrenheit(F):");
                temperatures[i][j]=sc.nextFloat();
            }
        }

        for (int i=0 ; i< temperatures.length ; i++)
        {
            float sum=0;
            for (int j=0 ; j< temperatures[i].length ; j++)
            {
                if (temperatures[i][j]<95)     // equipment correction
                {
                 temperatures[i][j]=95;
                }

                if (temperatures[i][j]>100){     // exceed count
                    exceedCount++;
                }

                //sum for avg
                sum+=temperatures[i][j];
            }
            avg = sum/ temperatures[i].length;

            System.out.println("Average temperature of Patient " + (i+1) + ": " + avg);

            if (avg > highestWeekAvg){
                highestWeekAvg =avg;
                highPatient=i + 1;
            }
        }

        System.out.println("Patient with highest weekly average: Patient " + highPatient);
        System.out.println("Highest weekly average temperature: " + highestWeekAvg);
        System.out.println("Number of times temperature exceeded 100°F: " + exceedCount);
    }
}