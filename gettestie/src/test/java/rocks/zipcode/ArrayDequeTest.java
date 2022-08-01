package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDequeTest {

    @Test
    public void arrayDequeTest_Add() {
        //GIVEN
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Integer expected = 3;

        //WHEN
        deque.add(1);
        deque.add(2);
        deque.add(3);
        Integer actual = deque.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayDequeTest_RemoveAll() {
        //GIVEN
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Integer[] nums = {1, 2};
        Integer expected = 1;

        //WHEN
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.removeAll(Arrays.asList(nums));
        Integer actual = deque.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayDequeTest_clear() {
        //GIVEN
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Integer expected = 0;

        //WHEN
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.clear();
        Integer actual = deque.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayDequeTest_Contains() {
        //GIVEN
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Integer[] nums = {1, 4, 8, 10, 20, 50};

        //WHEN
        deque.addAll(Arrays.asList(nums));
        boolean actual = deque.contains(20);

        //THEN
        Assert.assertTrue(actual);
    }

    @Test
    public void arrayDequeTest_Peek() {
        //GIVEN
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Integer[] nums = {1, 4, 8, 10, 20, 50};
        Integer expected = 1;

        //WHEN
        deque.addAll(Arrays.asList(nums));
        Integer actual = deque.peek();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayDequeTest_Poll() {
        //GIVEN
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Integer[] nums = {1, 4, 8, 10, 20, 50};
        Integer expected = 5;

        //WHEN
        deque.addAll(Arrays.asList(nums));
        deque.poll();
        Integer actual = deque.size();
        Integer expectedHead = 4;
        Integer actualHead = deque.peek();

        //THEN
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedHead, actualHead);
    }

    @Test
    public void arrayDequeTest_Pop() {
        //GIVEN
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Integer[] nums = {1, 4, 8, 10, 20, 50};
        Integer expected = 1;

        //WHEN
        deque.addAll(Arrays.asList(nums));
        Integer actual = deque.pop();

        //THEN
        Assert.assertEquals(expected, actual);
    }
}
