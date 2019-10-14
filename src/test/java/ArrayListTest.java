import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ArrayListTest {

    @Test
    public void addTest() {
        ArrayList<String> alist = new ArrayList<String>();
        String name = "Bob";
        alist.add(name);

        Assert.assertEquals(alist.get(0), name);
    }

    @Test
    public void getTest() {
        ArrayList<String> alist = new ArrayList<String>();
        String name = "Bob";
        alist.add(name);
        String actual = alist.get(0);

        Assert.assertEquals(actual, name);
    }

    @Test
    public void containsTest() {
        ArrayList<String> alist = new ArrayList<String>();
        String name = "Bob";
        alist.add(name);

        Assert.assertTrue(alist.contains(name));
    }

    @Test
    public void removeTest() {
        ArrayList<String> alist = new ArrayList<String>();
        String name = "Bob";
        alist.add(name);

        alist.remove(name);

        Assert.assertFalse(alist.contains(name));
    }

    @Test
    public void clearTest() {
        ArrayList<String> alist = new ArrayList<String>();
        String name = "Bob";
        alist.add(name);
        Assert.assertNotNull(alist);

        alist.clear();

        Assert.assertTrue(alist.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        ArrayList<String> alist = new ArrayList<String>();
        String name = "Bob";
        alist.add(name);

        Assert.assertFalse(alist.isEmpty());
    }

    @Test
    public void indexOfTest() {
        ArrayList<String> alist = new ArrayList<String>();
        String name = "Bob";
        alist.add(name);

        int actual = alist.indexOf(name);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
