

fun main() {
    // Exercici 1
    val word = readln()
    val letter = readln()[0]
    var count = 0

    for (l in word) {
        if (l == letter)
            ++count
    }

    println("La paraula $word conté $count vegades la lletra $letter")
}