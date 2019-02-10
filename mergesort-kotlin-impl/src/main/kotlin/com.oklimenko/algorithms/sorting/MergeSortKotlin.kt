package com.oklimenko.algorithms.sorting
class MergeSortKotlin {

    var array : IntArray
    var aux: IntArray

    constructor(array : IntArray) {
        this.array = array
        this.aux = IntArray(array.size)
    }

    fun mergeSort(l: Int, r: Int) {

        if (l >= r) {
            return
        }

        val m = (l + r) / 2

        mergeSort(l, m)
        mergeSort(m + 1, r)

        merge(l, m, r)

    }

    private fun merge(l: Int, m: Int, r: Int) {

        for (i in 0..r) {
            aux[i] = array[i]
        }

        var i = l
        var j = m + 1
        var k = l

        while (i <= m && j <= r) {

            if (aux[j] < aux[i]) {
                array[k] = aux[j]
                j++
            } else {
                array[k] = aux[i]
                i++
            }
            k++
        }

        while (i <= m) {
            array[k] = aux[i]
            i++
            k++
        }

        while (j <= r) {
            array[k] = aux[j]
            j++
            k++
        }
    }

}