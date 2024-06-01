package prob5;

public class prob5 {

    public static int maxValueInArray(int[] arr, int index, int currentMax) {
        if (index == arr.length) {
            return currentMax;
        } else {
            if (arr[index] > currentMax) {
                currentMax = arr[index];
            }
            return maxValueInArray(arr, index + 1, currentMax);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 6, 1, 9, 4, 24};
        System.out.println("Max value is: " + maxValueInArray(arr, 0, arr[0]));
    }
}
