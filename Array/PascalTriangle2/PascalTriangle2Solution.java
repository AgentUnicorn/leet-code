package Array.PascalTriangle2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2Solution {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        int rowNum = rowIndex + 1;

        // Use long instead of int because at the col = 15,
        // the number will reach the maximum of int before divide to 16
        long ans = 1;
        for (int col = 1; col < rowNum; col++) {
            ans = ans * (rowNum - col);
            ans = ans / col;
            row.add((int) ans);
        }

        return row;
    }

    public static void main(String[] args) {
        List<Integer> result = getRow(30);
        for (Integer num : result) {
            System.out.print(num + " ");
        }
    }
}
