package examen

fun main() {
    val matrix = listOf(
        listOf(1, 2, 3, 5),
        listOf(4, 5, 6, 7)
    )

    val files = matrix.size - 1
    val columnes = matrix[0].size - 1

    for (i in 0..files) {
        for (j in 0..columnes) {
            val resultat = matrix[i][j] * 2
            print("$resultat ")
        }
        println()
    }

}