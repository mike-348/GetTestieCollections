package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.*;

public class HashMapTest {

    Person kesha = new Person("Kesha", 1987);
    Person adam = new Person("Adam", 1979);

    @Test
    public void HashMapTest1_Put() {
        //GIVEN
        Map<String, Integer> map = new HashMap<>();
        Integer expected = 2;

        //WHEN
        map.put(kesha.getName(), kesha.getYearOfBirth());
        map.put(adam.getName(), adam.getYearOfBirth());
        Integer actual = map.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HashMapTest2_ContainsKey() {
        //GIVEN
        Map<Person, Integer> map = new HashMap<>();

        //WHEN
        map.put(kesha, kesha.getYearOfBirth());
        Boolean actual = map.containsKey(kesha);

        //THEN
        Assert.assertTrue(actual);
    }

    @Test
    public void HashMapTest3_ContainsValue() {
        //GIVEN
        Map<Person, Integer> map = new HashMap<>();

        //WHEN
        map.put(kesha, kesha.getYearOfBirth());
        Boolean actual = map.containsValue(1987);

        //THEN
        Assert.assertTrue(actual);
    }

    @Test
    public void hashMapTest_KeySet() {
        //GIVEN
        Map<Person, Integer> map = new HashMap<>();
        String expected = "[Name: Kesha\n" +
            "Year of birth: 1987\n" +
            "]";

        //WHEN
        map.put(kesha, kesha.getYearOfBirth());
        String actual = map.keySet().toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashMapTest_Remove() {
        //GIVEN
        Map<Person, Integer> map = new HashMap<>();
        Integer expected = 1;

        //WHEN
        map.put(kesha, kesha.getYearOfBirth());
        map.put(adam, adam.getYearOfBirth());
        map.remove(adam);
        Integer actual = map.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashMapTest_Replace() {
        //GIVEN
        Map<Person, Integer> map = new HashMap<>();
        Person keyToReplace = kesha;
        Integer expected = 2017;

        //WHEN
        map.put(kesha, kesha.getYearOfBirth());
        map.replace(keyToReplace, expected);
        Integer actual = map.get(kesha);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashMapTest_IsEmpty() {
        //GIVEN
        Map<Person, Integer> map = new HashMap<>();

        //WHEN
        boolean actual = map.isEmpty();

        //THEN
        Assert.assertTrue(actual);
    }

}
