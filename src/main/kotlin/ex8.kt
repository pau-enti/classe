fun main() {
    println ("Introduce numero:")

    var nu = readln().toInt()
    var s = 0

    // Cas llegir nombre zero
    if (nu == 0)
        s = 1

    while (nu != 0) {
        nu = nu / 10
        s += 1
    }

    print ("En total hi han $s digits")
}