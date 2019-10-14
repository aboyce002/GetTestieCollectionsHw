import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ArrayDequeTest {

    @Test
    public void pushTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1);
        Integer expected = 2;
        deque.push(2);
        Integer actual = deque.pop();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pollTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        Integer expected = 1;
        deque.add(expected);
        deque.add(2);
        Integer actual = deque.poll();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peekFirstTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        Integer expected = 1;
        deque.add(expected);
        deque.add(2);
        Integer actual = deque.peekFirst();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peekLastTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1);
        Integer expected = 2;
        deque.add(expected);
        Integer actual = deque.peekLast();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        Integer expected = 1;
        deque.add(expected);
        deque.remove(expected);

        Assert.assertFalse(deque.contains(expected));
    }

    @Test
    public void removeFirstTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        Integer expected = 1;
        deque.add(expected);
        deque.add(2);
        Integer actual = deque.removeFirst();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeLastTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1);
        Integer expected = 2;
        deque.add(expected);
        Integer actual = deque.removeLast();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        Integer expected = 1;
        deque.add(expected);
        Assert.assertNotNull(deque);

        deque.clear();

        Assert.assertTrue(deque.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        Integer expected = 1;
        deque.add(expected);

        Assert.assertFalse(deque.isEmpty());
    }
}
