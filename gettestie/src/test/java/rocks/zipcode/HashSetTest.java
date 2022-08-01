package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class HashSetTest {

    Person Tenae = new Person("Tenae", 1994);
    Person Mike = new Person("Mike", 1996);
    Person Thina = new Person("Thina", 1993);


    @Test
    public void hashSetTest_Size() {
        //GIVEN
        Set<Person> set = new HashSet<>();

        //WHEN
        set.add(Mike);
        set.add(Tenae);
        set.add(Thina);

        //THEN
        Assert.assertEquals(3, set.size());
    }

    @Test
    public void hashSetTest_Duplicates() {
        //GIVEN
        Set<Person> set = new HashSet<>();
        Integer expected = 1;

        //WHEN
        set.add(Mike);
        set.add(Mike);
        set.add(Mike);
        Integer actual = set.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashSetTest_Contains() {
        //GIVEN
        Set<Person> set = new HashSet<>();
        Boolean expected = true;

        //WHEN
        set.add(Mike);
        set.add(Tenae);
        set.add(Thina);
        Boolean actual = set.contains(Tenae);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashSetTest_InsertionOrder() {
        //GIVEN
        String[] names = {"Mike", "Tenae", "Thina"};
        Set<String> set = new HashSet<>(Arrays.asList(names));
        String expected = names.toString();

        //WHEN
        String actual = set.toString();

        //THEN
        Assert.assertFalse(expected.equals(actual));
        // HashSet does not maintain insertion order
    }
}
