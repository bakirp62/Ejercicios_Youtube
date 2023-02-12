fun main() {
//ciclo do while

    //haga un algoritmo que solicite el nombre de n cantidad de personas e imprima un saludo,
    //el usuario ingresara la cantidad de personas a validar
println(" ingrese la cantidad de personas a saludar:")
    val cantidadpersonas = readLine()!!.toInt()
    var contador =1
    do {
        println("ingrese el nombre de la persona $contador")
        val nombre = readLine()!!
        println("hola $nombre, bienvenido")
        contador++
    }while (contador <= cantidadpersonas)
}

