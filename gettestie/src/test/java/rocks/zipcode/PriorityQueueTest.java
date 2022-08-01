package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class PriorityQueueTest {

    @Test
    public void priorityQueueTest_AddAll() {
        //GIVEN
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Integer[] nums = {1, 3, 5, 7};
        Integer expected = 4;

        //WHEN
        queue.addAll(Arrays.asList(nums));
        Integer actual = queue.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void priorityQueueTest_Offer() {
        //GIVEN
        Integer[] nums = {2, 4, 6, 10, 8};
        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.asList(nums));
        String expected = "[2, 4, 6, 10, 8, 12]";

        //WHEN
        queue.offer(12);
        String actual = queue.toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void priorityQueueTest_OfferSorted() {
        //GIVEN
        Integer[] nums = {2, 4, 6, 10, 8};
        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.asList(nums));
        String expected = "[2, 4, 6, 8, 10, 12]";

        //WHEN
        queue.offer(12);
        List<Integer> queueStream = queue.stream()
            .sorted()
            .collect(Collectors.toList());
        String actual = queueStream.toString();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void priorityQueueTest_Peek() {
        //GIVEN
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Integer[] nums = {10, 20, 30, 100};
        String expected = "10";

        //WHEN
        queue.addAll(Arrays.asList(nums));
        String actual = queue.peek().toString();

        //THEN
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(4, queue.size());
    }

    @Test
    public void priorityQueueTest_Poll() {
        //GIVEN
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Integer[] nums = {10, 20, 30, 100};
        String expected = "10";

        //WHEN
        queue.addAll(Arrays.asList(nums));
        String actual = queue.poll().toString();

        //THEN
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(3, queue.size());
    }

}
