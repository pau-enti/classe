fun main() {
    val matrix = listOf(
        listOf("a", "b", "c"),
        listOf("d", "e", "f"),
        listOf("g", "h", "i")
    )


    for (i in 0..matrix.size - 1) {

        val ri = matrix.size - 1 - i

        for (j in 0..matrix[0].size - 1) {
            val rj = matrix[0].size - 1 - j
            print("| ${matrix[ri][rj]} ")
        }

        println("|")
    }
}