package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    @Test
    public void iteratorTest_Next() {
        //GIVEN
        List<String> names = new ArrayList<>();
        names.add("dipper");
        names.add("mable");
        names.add("stan");
        names.add("soos");

        //WHEN
        Iterator<String> it = names.iterator();

        //THEN
        Assert.assertEquals("dipper", it.next());
        Assert.assertEquals("mable", it.next());
    }

    @Test
    public void iteratorTest_HasNext() {
        //GIVEN
        List<String> names = new ArrayList<>();
        names.add("dipper");
        names.add("mable");
        names.add("stan");
        names.add("soos");

        //WHEN
        Iterator<String> it = names.iterator();
        boolean actual = it.hasNext();

        //THEN
        Assert.assertTrue(actual);
    }

    @Test
    public void iteratorTest_Remove() {
        //GIVEN
        List<String> names = new ArrayList<>();
        names.add("dipper");
        names.add("mable");
        names.add("stan");
        names.add("soos");
        String expected = "[dipper, mable, soos]";

        //WHEN
        Iterator<String> it = names.iterator();
        String str = "";

        while (it.hasNext()) {
            str = it.next();
            if (str.equals("stan")) {
                it.remove();
            }
        }

        String actual = names.toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }
}
