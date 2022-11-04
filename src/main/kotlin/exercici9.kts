println ("Introduce numero:")

var nu = readln().toInt()
var s = 0
var ok = 0
while (ok == 1) {

    nu = nu / 10

    if (nu > 0) {
        s= s +1
    }

    if (nu < 0) {

        print ("En total hi han $s digits")
        ok =1
    }

}