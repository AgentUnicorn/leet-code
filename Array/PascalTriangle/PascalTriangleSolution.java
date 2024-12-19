package Array.PascalTriangle;

import java.util.Arrays;
import java.util.*;

public class PascalTriangleSolution {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        int counter =  1;
        while (counter <= numRows) {
            list.add(generateRow(counter));
            counter++;
        }
        return list;
    }

    public static List<Integer> generateRow(int numRow) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        int ans = 1;
        for (int col = 1; col < numRow; col++) {
            ans = ans * (numRow - col);
            ans = ans / col;
            row.add(ans);
        }

        return row;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(31);
        for (List<Integer> innerList : result) {
            for (Integer num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line for each inner list
        }
    }
}
