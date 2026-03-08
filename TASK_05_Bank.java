import java.util.Scanner;

public class TASK_05_Bank
{
    int accountNumber;
    double balance;

    // static variables
    static int totalAccounts = 0;
    static double totalBankBalance = 0;

    // constructor
    TASK_05_Bank(int accNo, double bal)
    {
        accountNumber = accNo;
        balance = bal;

        // updating static values
        totalAccounts++;
        totalBankBalance = totalBankBalance + bal;
    }

    // static method for showing bank summary
    static void showBankSummary()
    {
        System.out.println("\n------ Bank Summary ------");
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();

        TASK_05_Bank accounts[] = new TASK_05_Bank[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for account " + (i + 1));

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Enter Balance: ");
            double bal = sc.nextDouble();

            accounts[i] = new TASK_05_Bank(accNo, bal);
        }

        // showing  the  summary
        showBankSummary();

        sc.close();
    }
}
