package codechallenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void ArrayShiftTest(){
        ArrayShift libraryToTest = new ArrayShift();
         String [] initialArray = new String[]{"1", "2", "3", "5", "6"};
         String insertNum = "4";
         String [] expectedArray = new String[]{"1", "2", "3","4", "5", "6"};
         String[] ShiftedArray = libraryToTest.insertShiftArray(initialArray,insertNum);
         assertArrayEquals(expectedArray,ShiftedArray);
    }
}
