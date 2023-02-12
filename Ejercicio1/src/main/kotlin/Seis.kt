fun main() {
    //ciclo while

    //Haga un algoritmo que solicite un numero y si esste es negativo lo convierta a positivo y lo imprima,
    //realice este proceso n cantidad de veces.

var numero: Int
var continuar = "si"
    while (continuar.uppercase()=="SI"){
        println("ingrese un numero:")
        numero = readLine()!!.toInt()

        if (numero < 0){
            numero = numero * 1
        }

        println("el numero positivo es: $numero")
        println("desea ingresar otro numero (SI/NO):")
        continuar = readLine()!!
    }


}