package orgUnitTesting.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {

    @Test
    public void sortArrayTest() {

        Sorting sort = new Sorting();
        int[] inputArray = {5,2,2,3,7,1};
        int[] ansArray = {1,2,2,3,5,7};

        sort.sortArray(inputArray);

        Assertions.assertArrayEquals(ansArray,inputArray);
    }
}
