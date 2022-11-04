fun main() {
    val K = readln().toIntOrNull() ?: 0

    for (candidat in 1 .. K) {
        var isNotPrime = false

        for (i in 2 .. candidat - 1) {
            if (candidat % i == 0) {
                isNotPrime = true
                break
            }
        }

        if (!isNotPrime)
            println("$candidat")
    }

}
