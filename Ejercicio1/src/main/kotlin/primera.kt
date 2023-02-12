fun main() {
    //condicionales simples
    //haga un algoritmo  que solicite el ingreso de un numero positivo, en caso de ser negativo imprima un mensaje
    //indicando que no es positivo
println("ingrese un numero positivo:")
    val num = readLine()!!.toInt()
    if (num < 0){
        println("el numero no es positivo")
    }
    println("el numero es positivo: $num")
}

