package main.java.com.thoughtworks.testdemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestDemoTest {

    @Test
    public void getFibonacciSequence() {
        Integer[] array = new Integer[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        List<Integer> arrayList = Arrays.asList(array);
        TestDemo testDemo = new TestDemo();
        assertEquals(testDemo.getFibonacciSequence(), arrayList);

    }

    @Test
    public void sortInteger() {
        Integer[] array = new Integer[]{1, 3, 2, 6, 5, 9};
        Integer[] sortedArray = new Integer[]{1, 2, 3, 5, 6, 9};
        TestDemo testDemo = new TestDemo();
        assertEquals(testDemo.sortInteger(array), sortedArray);
    }

    @Test
    public void getEvenAdd() {
        Integer[] array = new Integer[]{1, 3, 2, 6, 5, 9};
        int evenAdd = 8;
        TestDemo testDemo = new TestDemo();
        assertEquals(testDemo.getEvenAdd(array), evenAdd);

    }
}