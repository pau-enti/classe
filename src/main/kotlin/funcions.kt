fun printOnlyOdds(list:List<Int?>){

    for (element in list) {
        if (element?.rem(2) == 0) {
            print("$element ")
        }
    }
}


fun main(){
    printOnlyOdds(listOf(1, 2,  null, 3, 4, 5))
}


fun nullSafetyAverage(list: List<Int?>?): Double {
//    if (list == null)
//        return 0.0
    list ?: return 0.0

    var suma = .0
    var count = 0

    for (elem in list) { // elem: Int?
        suma += elem ?: continue
        ++count
    }
    return suma / count
}





fun nullSafetySum(a: Int?, b: Int?): Int {
    return (a ?: 0) + (b ?: 0)
}



fun isPerfect(n: Int): Boolean {
    var suma = 0

    for (x in 1..n / 2) {
        if (n % x == 0)
            suma += x
    }

    return n == suma
}


fun factorize(n: Int): List<Int> {

    val result = arrayListOf<Int>()
    var number = n

    for (x in 2..n - 1) {
        while (number % x == 0) {
            result.add(x)
            number /= x
        }
        if (number == 1)
            break
    }

    return result
}



