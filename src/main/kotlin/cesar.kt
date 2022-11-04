import kotlin.math.*
fun main() {

    // EXERCICI 2

    val stop = "#"
    var precios = arrayListOf("222.2", "5.6", "1.5", "6.8", "22.1", "2.3", "12.8", "311.3", stop,  "0.0", "7.3", "3.4")

    var counter = 0;
    var max = precios[0]
    var min = precios[0]

    while(precios[counter] != stop){

        if (precios[counter + 1] == stop){
            break
        }
        else {
            if (max.toDouble() < precios[counter + 1].toDouble()) {
                max = precios[counter + 1]
            }
            if (min.toDouble() > precios[counter + 1].toDouble()) {
                min = precios[counter + 1]
            }
        }

        counter++
    }

    println("El valor MAXIMO ES: $max")
    println("El valor MINIMO ES: $min")

    var contadorInverso = precios.size - 1
    println("LISTA VALORES AL REVES: " )
    while(contadorInverso >= 0){
        print("${precios[contadorInverso]}, ")
        contadorInverso--
    }

    // EXERCICI 5

    val asignatures = listOf("Matematiques", "Fisica", "Quimica", "Historia", "Llengua")

    var notes = arrayListOf("0.0", "0.0", "0.0", "0.0", "0.0")
    var contador = 0

    while(contador < notes.size){
        print("Digite la nota de ${asignatures[contador]} SIEMPRE CON DECIMAL POR FAVOR: ")
        notes[contador] = readln()

        contador++
    }

    var millorNota = notes[0]
    var pitjorNota = notes[0]

    var indexMillorNota = 0
    var indexPitjorNota = 0

    contador = 0;
    while (contador < notes.size){
        println("A ${asignatures[contador]} has tret un ${notes[contador]}")
       if (contador < notes.size - 1) {
            if (millorNota.toDouble() < notes[contador + 1].toDouble()) {
                millorNota = notes[contador + 1]
                indexMillorNota = contador + 1
            }
           if (pitjorNota.toDouble() > notes[contador + 1].toDouble()) {
               pitjorNota = notes[contador + 1]
               indexPitjorNota = contador + 1
           }
        }
        contador++
    }

    println("Millor Nota es de l'asignatura: ${asignatures[indexMillorNota]}, amb un ${notes[indexMillorNota]}")
    println("Pitjor Nota es de l'asignatura: ${asignatures[indexPitjorNota]}, amb un ${notes[indexPitjorNota]}")
}
