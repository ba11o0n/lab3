import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 2, 1}, input2);

    // int[] input3 = {2, 1, 0};
    // ArrayExamples.reverseInPlace(input3);
    // assertArrayEquals(new int[]{0, 1, 2}, input3);
	}


  //@Test
  //public void testReversed() {
    // int[] input1 = { };
    // assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  //}


  //@Test
  //public void testAverageWithoutLowest() {
    // double[] newList = {3.0, 3.0, 5.0}; 
    // double x = ArrayExamples.averageWithoutLowest(newList); 
    // assertEquals((5.0), x, .01); 
  //}
}
