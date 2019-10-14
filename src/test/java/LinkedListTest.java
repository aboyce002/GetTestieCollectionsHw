import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class LinkedListTest {

    @Test
    public void addTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 1;
        llist.add(expected);

        Assert.assertEquals(llist.peek(), expected);

        llist.add(2);
        llist.add(4);
        llist.add(2, 3);

        Assert.assertEquals(2, llist.indexOf(3));
    }

    @Test
    public void addFirstTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 4;
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.addFirst(expected);

        Assert.assertEquals(expected, llist.getFirst());
    }

    @Test
    public void addLastTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 4;
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.addLast(expected);

        Assert.assertEquals(expected, llist.getLast());
    }

    @Test
    public void peekFirstTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 4;
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.addFirst(expected);
        Assert.assertEquals(expected, llist.peekFirst());
    }

    @Test
    public void peekLastTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 4;
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.addLast(expected);
        Assert.assertEquals(expected, llist.peekLast());
    }

    @Test
    public void removeTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 1;
        llist.add(expected);
        llist.remove(expected);

        Assert.assertFalse(llist.contains(expected));
    }

    @Test
    public void removeFirstTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 1;
        llist.add(expected);
        llist.add(2);
        Integer actual = llist.removeFirst();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeLastTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        llist.add(1);
        Integer expected = 2;
        llist.add(expected);
        Integer actual = llist.removeLast();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 1;
        llist.add(expected);
        Assert.assertNotNull(llist);

        llist.clear();

        Assert.assertTrue(llist.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Integer expected = 1;
        llist.add(expected);

        Assert.assertFalse(llist.isEmpty());
    }
}
