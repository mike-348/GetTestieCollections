package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void treeMapTest_CeilingValue() {
        TreeMap<Integer, Integer> treemap = new TreeMap();
        Integer[] keys = {8, 7, 6, 5, 4, 3, 2, 1};
        String expected = "8=9";

        for (Integer i : keys) {
            treemap.put(i, i + 1);
        }

        //WHEN
        String actual = treemap.ceilingEntry(8).toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeMapTest_CeilingKey() {
        //GIVEN
        TreeMap<Integer, Integer> treemap = new TreeMap();
        Integer[] keys = {1, 3, 5, 7, 9};
        Integer expected = 3;

        for (Integer key : keys) {
            treemap.put(key, key + 1);
        }

        //WHEN
        Integer actual = treemap.ceilingKey(2);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeMapTest_DescendingKeySet() {
        //GIVEN
        TreeMap<Integer, Integer> treeMap = new TreeMap();
        Integer[] keys = {2, 4, 6, 8, 10};
        String expected = "[10, 8, 6, 4, 2]";

        for (Integer key : keys) {
            treeMap.put(key, key + 1);
        }

        //WHEN
        String actual = treeMap.descendingKeySet().toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeMapTest_LowerEntry() {
        //GIVEN
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer[] keys = {4, 2, 7, 6, 5};
        String expected = "6=7";

        for (Integer key : keys) {
            treeMap.put(key, key + 1);
        }

        //WHEN
        String actual = treeMap.lowerEntry(7).toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeMapTest_PollLastEntry() {
        //GIVEN
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer[] keys = {10, 1, 2, 3, 4};
        String expected = "[1, 2, 3, 4]";

        for (Integer key : keys) {
            treeMap.put(key, key + 1);
        }

        //WHEN
        treeMap.pollLastEntry();
        String actual = treeMap.keySet().toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeMapTest_LastEntry() {
        //GIVEN
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer[] keys = {10, 1, 2, 3, 4};
        String expected = "10=11";

        for (Integer key : keys) {
            treeMap.put(key, key + 1);
        }

        //WHEN
        String actual = treeMap.lastEntry().toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }
}
