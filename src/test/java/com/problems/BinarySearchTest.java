package com.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple BinarySearch.
 */
public class BinarySearchTest
{
    private static final Logger logger = LoggerFactory.getLogger(BinarySearchTest.class);


    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    public void indexOf3() {
        List<Integer> numbers = Arrays.asList(14, 45, 3, 676, 89865, 0);

        int index = binarySearch.search(numbers, 3);

        Assert.assertEquals(2, index);
    }


}
