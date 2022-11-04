fun main() {

    while (true) {
        val n = readln().toIntOrNull()

        if (n == null)
            break

        for (j in 1..n) {
            for (i in 1..n) {
                print("$n ")
            }
            println()
        }
    }

    listOf(listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9))

}