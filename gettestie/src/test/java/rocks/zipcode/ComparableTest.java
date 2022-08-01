package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {

    @Test
    public void comparableTest_CompareToLess() {
        //GIVEN
        Integer x = 2;
        Integer y = 3;
        Integer expected = -1;

        //WHEN
        Integer actual = x.compareTo(y);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToGreater() {
        //GIVEN
        Integer x = 2;
        Integer y = 3;
        Integer expected = 1;

        //WHEN
        Integer actual = y.compareTo(x);

        //THEN
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testCompareToEquals() {
        //GIVEN
        Integer x = 2;
        Integer y = 2;
        Integer expected = 0;

        //WHEN
        Integer actual = x.compareTo(y);

        //THEN
        Assert.assertEquals(expected, actual);

    }
}
