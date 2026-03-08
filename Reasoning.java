public class Reasoning {
    //CLASS QUESTIONS

    //1. CAN NON-STATIC METHOD ACCESS THE STATIC FIELDS?
    /*Yes. A non-static method can access static fields.
    REASON:
    Static variables belong to the class, not to individual objects.
Non-static methods belong to objects, but they can still access class variables.
So inside a normal method you can use a static variable directly.

EXAMPLE OF TASK-05 BANK:
class Bank {
    static int totalAccounts = 0;   // static field

    int accountNumber;

    void createAccount(int num) {   // non-static method
        accountNumber = num;
        totalAccounts++;            // accessing static field
    }

    void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Total Accounts: " + totalAccounts); // static access
    }
     */



    //2. JAGGED ARRAY:
    /*A jagged array is a 2D array where each row can have a different number of columns.
    So unlike a normal 2D array, the column size is not the same for every row.

    FOR EXAMPLE:
    int[][] arr = new int[3][];

arr[0] = new int[2];  // row 0 has 2 columns
arr[1] = new int[4];  // row 1 has 4 columns
arr[2] = new int[1];  // row 2 has 1 column
    */
}
