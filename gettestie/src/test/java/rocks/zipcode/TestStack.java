package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @Test
    public void stackTest_Push() {
        //GIVEN
        Stack<Integer> stack = new Stack<>();
        Integer expected = 2;


        //WHEN
        stack.push(5);
        stack.push(2);
        Integer actual = stack.size();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stackTest_Peek() {
        //GIVEN
        Stack<Integer> stack = new Stack<>();
        Integer expected = 20;

        //WHEN
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        Integer actual = stack.peek();

        //THEN
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(4, stack.size());
    }

    @Test
    public void stackTest_Pop() {
        //GIVEN
        Stack<Integer> stack = new Stack<>();
        Integer expected = 3;

        //WHEN
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        Integer numPopped = stack.pop();
        Integer actual = stack.size();

        //THEN
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(20, (long) numPopped);
    }

    @Test
    public void stackTest_IsEmpty() {
        //GIVEN
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //WHEN
        boolean actual = stack.isEmpty();

        //THEN
        Assert.assertFalse(actual);
    }
}
