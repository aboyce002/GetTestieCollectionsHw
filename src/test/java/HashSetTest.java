import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class HashSetTest {

    @Test
    public void addTest() {
        HashSet<Integer> hset = new HashSet<Integer>();
        Integer expected = 1;
        hset.add(expected);

        Assert.assertTrue(hset.contains(1));
    }

    @Test
    public void containsTest() {
        HashSet<Integer> hset = new HashSet<Integer>();
        Integer expected = 1;
        hset.add(expected);

        Assert.assertTrue(hset.contains(expected));
    }

    @Test
    public void removeTest() {
        HashSet<Integer> hset = new HashSet<Integer>();
        Integer expected = 1;
        hset.add(expected);

        hset.remove(expected);

        Assert.assertFalse(hset.contains(expected));
    }

    @Test
    public void clearTest() {
        HashSet<Integer> hset = new HashSet<Integer>();
        Integer expected = 1;
        hset.add(expected);
        Assert.assertNotNull(hset);

        hset.clear();

        Assert.assertTrue(hset.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        HashSet<Integer> hset = new HashSet<Integer>();
        Integer expected = 1;
        hset.add(expected);

        Assert.assertFalse(hset.isEmpty());
    }
}
