package com.oklimenko.algorithms.sorting;

public class MergeSortJava {

    private int[] array;
    private int[] aux;

    public MergeSortJava(int[] array) {
        this.array = array;
        this.aux = new int[array.length];
    }


    public void mergeSort(int l, int r) {

        if (l>=r) {
            return;
        }

        int m = (l+r)/2;

        mergeSort(l, m);
        mergeSort(m+1, r);

        merge(l, m, r);

    }


    private void merge(int l, int m, int r) {

//        int[] aux = new int[array.length];

        for ( int i=0; i<=r; i++) {
            aux[i] = array[i];
        }

        int i = l;
        int j = m+1;
        int k = l;


        while (i<=m && j<=r) {

            if (aux[j] < aux[i]) {
                array[k] = aux[j];
                j++;
            } else {
                array[k] = aux[i];
                i++;
            }
            k++;
        }

        while (i<=m) {
            array[k] = aux[i];
            i++;
            k++;
        }

        while (j<=r) {
            array[k] = aux[j];
            j++;
            k++;
        }

    }

}
