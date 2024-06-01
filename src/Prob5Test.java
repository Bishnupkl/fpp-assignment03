package Prob5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob5Test {
    @Test
    public void testMaxValue () {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int maxValue = 9;
        int result = prob5.maxValueInArray(arr, 0, arr[0]);
        assertEquals(maxValue, result);
    }

}