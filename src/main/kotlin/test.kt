import kotlin.math.*

fun main() {

    val x = 2.4
    val xInt = x.toInt()

    val down = xInt
    var up = xInt + 1

    if (x - xInt >= 0)
        up = xInt

    val round = if (x - xInt >= 0.5) {
        up
    } else {
        down
    }

    print("up: $up down: $down round: $round")








}

//}
//
//
//// EXERCICI 7
//println("Escribe el valor A de la equacion: ")
//val valueA = readln().toDouble()
//
//println("Escribe el valor B de la equacion: ")
//val valueB = readln().toDouble()
//
//println("Escribe el valor C de la equacion: ")
//val valueC = readln().toDouble()
//
//val resultadoPositivo = ((-valueB) + (sqrt(valueB.pow(2) - 4 * valueA * valueC))) / (2 * valueA)
//val resultadoNegativo = ((-valueB) - (sqrt(valueB.pow(2) - 4 * valueA * valueC))) / (2 * valueA)
//
////    if (resultadoNegativo == Double.NaN)
//
//println("X1 = $resultadoPositivo, X2 = $resultadoNegativo")




//
//print("Introdueix a: ")
//val a = readln().toIntOrNull() ?: 0
//
//print("\nIntrodueix b: ")
//val b = readln().toIntOrNull() ?: 0
//
//if (b == 0)
//print("No es pot dividir per zero")
//else {
//    val d = a / b
//    val r  = a % b
//    val exacta = a.toDouble() / b
//
//    println("Divisio entera: $d, Residu: $r")
//    println("Exacta: $exacta")
//}





//    val total =544354
//
//    val hores = total / 3600
//    val resto = total % 3600
//
//    val minuts = resto / 60
//    val segons = resto % 60
//
//    print("h: $hores m: $minuts s: $segons")
