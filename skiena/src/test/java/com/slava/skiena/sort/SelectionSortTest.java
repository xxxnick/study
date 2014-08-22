package com.slava.skiena.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vserghienco on 8/14/14.
 */
public class SelectionSortTest {

    private int[] expectedList = {0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9};

    @Test
    public void testSelectionSort() throws Exception {
        int[] list = {1, 4, 5, 0, 6, 7, 8, 3, 5, 9, 2};
        SelectionSort.sort(list);
        Assert.assertArrayEquals(expectedList, list);
    }
}
