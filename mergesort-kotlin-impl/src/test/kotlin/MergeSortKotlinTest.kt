import com.oklimenko.algorithms.sorting.MergeSortKotlin
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.*

class MergeSortKotlinTest {


    private val N = 10000
    private val MAX_VALUE = 1000

    @Test fun mergeTest() {
        val random = Random()
        val array = IntArray(N)
        val halfValue = MAX_VALUE / 2

        for (i in 0 until N) {
            array[i] = random.nextInt(MAX_VALUE) - halfValue
        }

        val mergeSortJava = MergeSortKotlin(array)
        mergeSortJava.mergeSort(0, array.size - 1)

        checkSorted(array)
    }

    private fun checkSorted(array: IntArray) {
        for (i in 0 until array.size - 1) {
            assertTrue(array[i] <= array[i + 1])
        }
    }

}