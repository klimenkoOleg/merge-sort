package com.oklimenko.algorithms.sorting;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;


public class MergeSortTest {

    private static final int N = 10_000;
    private static final int MAX_VALUE = 1_000;

    @Test
    public void testMergeSort() {

        Random random = new Random();
        int[] array = new int[N];
        int halfValue = MAX_VALUE/2;

        for (int i=0; i<N; i++) {
            array[i] = random.nextInt(MAX_VALUE) - halfValue;
        }
        MergeSortJava mergeSortJava = new MergeSortJava(array);
        mergeSortJava.mergeSort(0, array.length-1);

        checkSorted(array);
    }

    private void checkSorted(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            assertTrue(array[i]<=array[i+1]);
        }
    }



}
