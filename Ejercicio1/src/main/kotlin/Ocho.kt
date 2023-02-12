fun main() {
    //Ciclo for
    //Cree un algoritmo que lea un numero y determine si este es divisible entre 11

println("ingrese la cantidad de numeros a procesar")
    val cantidad = readLine()!!.toInt()
    for (i in 1 .. cantidad){
        println("ingrese un numero:")
        val numero = readLine()!!.toInt()
        if (numero % 11 == 0){
            println(" el numero es $numero es divisible entre 11")
        }else{
            println("el numero $numero no es divisible entre 11")
        }

    }

}