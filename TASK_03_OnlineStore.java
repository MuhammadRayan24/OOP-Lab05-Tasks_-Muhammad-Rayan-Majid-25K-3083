import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TASK_03_OnlineStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> orders = new ArrayList<>();

        System.out.println("Enter The Number Of Orders: ");
        int n = sc.nextInt();

        // Inputting orders
        for (int i = 0; i < n; i++) {
            System.out.println("Enter order amount " + (i + 1) + ": ");
            double order = sc.nextDouble();
            orders.add(order);
        }

        // Removing the orders below 500
        orders.removeIf(order -> order < 500);

        // Apply discount
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) > 5000) {
                orders.set(i, orders.get(i) * 0.9);
            }
        }

        // Calculating revenue
        double totalRevenue = 0;
        for (double order : orders) {
            totalRevenue += order;
        }

        // Sorting orders
        Collections.sort(orders);

        // Displaying sorted list
        System.out.println("\nSorted Order List:");
        for (double order : orders) {
            System.out.println(order);
        }

        // Displaying  revenue
        System.out.println("\nTotal Revenue: " + totalRevenue);
    }
}