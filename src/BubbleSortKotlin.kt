class BubbleSortKotlin {
    fun bubbleSort(arr: IntArray) {
        val n = arr.size
        for (i in 0 until n - 1) for (j in 0 until n - i - 1) if (arr[j] > arr[j + 1]) {
            val temp = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = temp
        }
    }

    fun printArray(arr: IntArray) {
        for (j in arr) print("$j ")
        println()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Kotlin bubble sort")
            val ob = BubbleSortKotlin()
            val arr = intArrayOf(5, 1, 4, 2, 8)
            println("Unsorted array")
            ob.printArray(arr)
            ob.bubbleSort(arr)
            println("Sorted array")
            ob.printArray(arr)
        }
    }
}