package arrays;
import java.util.Arrays;

public class arraysreturn {
    public static void main(String[] args) {
        int[] iq = {126, 84, 149, 167, 95};
        int[] stuttered = stutter(iq);
        System.out.println(Arrays.toString(stuttered));
    }

    public static int[] stutter(int[] array) {
        int[] result = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            result[2 * i] = array[i];
            result[2 * i + 1] = array[i];
        }
        return result;
    }
}
