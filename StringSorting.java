import java.util.Arrays;
//CLASS QUESTIONS
// sorting of array of strings

public class StringSorting {
    public static void main(String[] args)
    {
    String names[] = {"Rayan", "Laiba", "Arham", "Maham", "Wasi"};

    // Sorting the names in array

    Arrays.sort(names);

    // Printing sorted array names

    System.out.println("Sorted Names: ");

    for (String name : names)
    {
        System.out.println(name);
    }
}
}
