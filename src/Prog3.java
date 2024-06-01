import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {

        int[] initialArray = {1, 3, 4, 7, 9, 13};
        System.out.println(STR."Array Before Reversing:\{Arrays.toString(initialArray)}");
        reverseArray(initialArray);
        System.out.println(STR."Array After Reversing:\{Arrays.toString(initialArray)}");
    }

    public static void reverseArray(int[] array) {
        reverseArray(array, 0, array.length - 1);
    }

    private static void reverseArray(int[] array, int i, int j) {
        if (i >= j) {
            return;
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        reverseArray(array, ++i, --j);

    }
}
