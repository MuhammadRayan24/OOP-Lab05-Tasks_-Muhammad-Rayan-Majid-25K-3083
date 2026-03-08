//CLASS QUESTIONS:
/* 1. Union And Intersection
   2. Strings Sorting
   3. Reasoning Questions
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class UnionIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Union
        Set<Integer> unionSet = new HashSet<>();
        for (int num : array1) unionSet.add(num);
        for (int num : array2) unionSet.add(num);

        System.out.println("Union: " + unionSet);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : array1) intersectionSet.add(num);

        // Converting arr2 to Set
        Set<Integer> set2 = new HashSet<>();
        for (int num : array2) set2.add(num);

        intersectionSet.retainAll(set2);

        System.out.println("Intersection: " + intersectionSet);
    }
}
