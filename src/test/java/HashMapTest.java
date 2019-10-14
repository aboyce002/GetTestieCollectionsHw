import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class HashMapTest {

    @Test
    public void putTest() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        int num = 5;
        String name = "Bob";

        map.put(num, name);

        Assert.assertTrue(map.containsKey(num));
        Assert.assertTrue(map.containsValue(name));
    }

    @Test
    public void getTest() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        int num = 5;
        String name = "Bob";
        map.put(num, name);
        Assert.assertTrue(map.containsKey(num));

        String expected = map.get(5);

        Assert.assertEquals(expected, name);
    }

    @Test
    public void removeTest() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        int num = 5;
        String name = "Bob";
        map.put(num, name);
        Assert.assertTrue(map.containsKey(num));
        map.remove(num);

        Assert.assertFalse(map.containsKey(num));
    }

    @Test
    public void clearTest() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        int num = 5;
        String name = "Bob";

        map.put(num, name);
        Assert.assertNotNull(map);

        map.clear();

        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        int num = 5;
        String name = "Bob";
        map.put(num, name);

        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void containsKeyTest() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        int num = 5;
        String name = "Bob";
        map.put(num, name);
        Assert.assertTrue(map.containsKey(num));
    }

    @Test
    public void containsValueTest() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        int num = 5;
        String name = "Bob";
        map.put(num, name);
        Assert.assertTrue(map.containsValue(name));
    }
}
