package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class ArrayListTest {

    Person Tenae = new Person("Tenae", 1994);
    Person Mike = new Person("Mike", 1996);
    Person Thina = new Person("Thina", 1993);

    Address sherlock = new Address("221B Baker St", "London", "NW1 6XE");
    Address watson = new Address("221B Baker St", "London", "NW1 6XE");

    @Test
    public void arrayListTest_Add() {
        //GIVEN
        List<Address> list = new ArrayList<>();
        Integer expected = 2;

        //WHEN
        list.add(sherlock);
        list.add(watson);
        Integer actual = list.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListTest_Remove() {
        //GIVEN
        List<Address> list = new ArrayList<>();
        Integer expected = 1;

        //WHEN
        list.add(sherlock);
        list.remove(sherlock);
        list.add(watson);
        Integer actual = list.size();


        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListTest_Clear() {
        //GIVEN
        List<Address> list = new ArrayList<>();
        Integer expected = 0;

        //WHEN
        list.add(sherlock);
        list.add(watson);
        list.clear();
        Integer actual = list.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListTest_Get() {
        //GIVEN
        List<Person> list = new ArrayList<>();
        Person expected = Thina;

        //WHEN
        list.add(Mike);
        list.add(Tenae);
        list.add(Thina);
        Person actual = list.get(2);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListTest_RemoveIf() {
        //GIVEN
        List<Person> list = new ArrayList<>();

        //WHEN
        list.add(Mike);
        list.add(Tenae);
        list.add(Thina);
        list.removeIf(p -> p.equals(Thina));

        //THEN
        Assert.assertFalse(list.contains(Thina));
    }

    @Test
    public void arrayListTest_ToArray() {
        //GIVEN
        List<Person> list = new ArrayList<>();
        Integer expected = 3;

        //WHEN
        list.add(Mike);
        list.add(Tenae);
        list.add(Thina);
        Person[] personArray = list.toArray(new Person[list.size()]);
        Integer actual = personArray.length;

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListTest_IndexOf() {
        //GIVEN
        List<String> list = new ArrayList<>();
        Integer expected = 1;

        //WHEN
        list.add("abc");
        list.add("123");
        list.add("you");
        list.add("me");
        Integer actual = list.indexOf("123");

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListTest_IsEmpty() {
        List<String> list = new ArrayList<>();
        Boolean expected = true;

        //WHEN
        list.add("abc");
        list.add("123");
        list.add("you");
        list.add("me");
        list.clear();
        Boolean actual = list.isEmpty();


        //THEN
        Assert.assertEquals(expected, actual);
    }
}
