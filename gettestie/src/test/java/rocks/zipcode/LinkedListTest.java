package rocks.zipcode;

import jdk.javadoc.internal.doclets.toolkit.taglets.snippet.Style;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void linkedListTest_AddAll() {
        //GIVEN
        LinkedList<Integer> list = new LinkedList<>();
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer expected = 5;

        //WHEN
        list.addAll(Arrays.asList(nums));
        Integer actual = list.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

}
