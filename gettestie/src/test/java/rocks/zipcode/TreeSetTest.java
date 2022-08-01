package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TreeSetTest {

    @Test
    public void treeSetTest_Add() {
        //GIVEN
        TreeSet<String> treeSet = new TreeSet<>();
        Integer expected = 3;

        //WHEN
        treeSet.add("JT");
        treeSet.add("Rihanna");
        treeSet.add("Estelle");
        Integer actual = treeSet.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeSetTest_AddDupes() {
        //GIVEN
        TreeSet<Integer> treeSet = new TreeSet<>();
        Integer expected = 2;

        //WHEN
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(2);
        Integer actual = treeSet.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeSetTest_First() {
        //GIVEN
        String[] names = {"Justin", "Lady Gaga", "Adam", "Rihanna", "Snoop"};
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(names));
        String expected = "Adam";

        //WHEN
        String actual = treeSet.first();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeSetTest_Floor() {
        //GIVEN
        Integer[] nums = {1, 5, 2, 3, 8, 6};
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(nums));
        Integer expected = 8;

        //WHEN
        Integer actual = treeSet.floor(9);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeSetTest_HeadSet() {
        //GIVEN
        Integer[] nums = {1, 2, 3, 4, 5, 10, 20};
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(nums));
        String expected = "[1, 2, 3, 4, 5]";

        //WHEN
        String  actual = treeSet.headSet(10).toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }
}
