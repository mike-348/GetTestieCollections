package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    /*
    There are many reasons to use a vector in Java. Some common reasons are:

        -To store a list of objects
        -To implement a stack
        -To implement a queue
        -To implement a priority queue
        -To implement a list that can grow or shrink dynamically
     */

    @Test
    public void vectorTest_Capacity() {
        //GIVEN
        Vector<String> vector = new Vector<>();
        Integer expected = 10;

        //WHEN
        Integer actual = vector.capacity(); // 10 is default size

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void vectorTest_Capacity1() {
        //GIVEN
        Vector<Integer> vector = new Vector<>(5);
        Integer expected = 5;

        //WHEN
        Integer actual = vector.capacity();

        //THEN
        Assert.assertEquals(expected, actual);
    }

}
