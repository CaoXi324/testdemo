package main.java.com.thoughtworks.testdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDemo {
    public List<Integer> getFibonacciSequence() {
        List<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(1);
        fibonacciSequence.add(1);
        for (int i = 0; i < 10; i++) {
            int add1 = fibonacciSequence.get(i);
            int add2 = fibonacciSequence.get(i + 1);
            fibonacciSequence.add(add1 + add2);
        }
        return fibonacciSequence;
    }

    public Integer[] sortInteger(Integer[] arrays) {
        Collections.sort(Arrays.asList(arrays));
        return arrays;
    }

    public int getEvenAdd(Integer[] arrays) {
        int add=Arrays.stream(arrays).filter(ele->ele%2==0).reduce(0,(a,b)->(a+b));
        return add;
    }
}
