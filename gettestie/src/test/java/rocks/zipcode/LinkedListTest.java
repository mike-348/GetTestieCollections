package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

    @Test
    public void linkedListTest_GetLast() {
        //GIVEN
        LinkedList<Integer> list = new LinkedList<>();
        Integer[] nums = {10, 20, 30 , 40 , 50};
        Integer expected = 50;

        //WHEN
        list.addAll(Arrays.asList(nums));
        Integer actual = list.getLast();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linkedListTest_Clear() {
        //GIVEN
        LinkedList<Integer> list = new LinkedList<>();
        Integer[] nums = {10, 20, 30 , 40 , 50};
        Integer expected = 0;

        //WHEN
        list.addAll(Arrays.asList(nums));
        list.clear();
        Integer actual = list.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linkedListTest_AddFirst() {
        //GIVEN
        LinkedList<Integer> list = new LinkedList<>();
        Integer[] nums = {4, 6, 8, 10};
        Integer expected = 2;

        //WHEN
        list.addAll(Arrays.asList(nums));
        list.addFirst(expected);
        Integer actual = list.getFirst();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linkedListTest_AddLast() {
        //GIVEN
        LinkedList<Integer> list = new LinkedList<>();
        Integer[] nums = {2, 4, 6, 8};
        Integer expected = 10;

        //WHEN
        list.addAll(Arrays.asList(nums));
        list.addLast(expected);
        Integer actual = list.getLast();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linkedListTest_PollLast() {
        //GIVEN
        LinkedList<Integer> list = new LinkedList<>();
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        Integer expectedSize = 5;
        Integer expectedPoll = 6;

        //WHEN
        list.addAll(Arrays.asList(nums));
        Integer actualPoll = list.pollLast();
        Integer actualSize = list.size();

        //THEN
        Assert.assertEquals(expectedPoll, actualPoll);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void linkedListTest_PollFirst() {
        //GIVEN
        LinkedList<Integer> list = new LinkedList<>();
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        Integer expectedSize = 5;
        Integer expectedPoll = 1;

        //WHEN
        list.addAll(Arrays.asList(nums));
        Integer actualPoll = list.pollFirst();
        Integer actualSize = list.size();

        //THEN
        Assert.assertEquals(expectedPoll, actualPoll);
        Assert.assertEquals(expectedSize, actualSize);
    }



}
