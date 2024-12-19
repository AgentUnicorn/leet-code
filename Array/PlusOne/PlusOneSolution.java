package Array.PlusOne;

import java.util.Arrays;

public class PlusOneSolution {

    public static int[] plusOne(int[] digits) {
        int pointer = digits.length - 1;
        return plus(digits, pointer);
    }

    public static int[] plus(int[] digits, int pointer) {
        digits[pointer] = digits[pointer] + 1;

        if (digits[pointer] <= 9) {
            return digits;
        }

        digits[pointer] = digits[pointer] - 10;
        if (pointer - 1 >= 0) {
            pointer--;
            return plus(digits, pointer);
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] result = plusOne(new int[]{9});
        System.out.println(Arrays.toString(result));
    }
}
