fun main() {
    // Crear una lista de enteros
    val numeros = listOf(1, 2, 3, 4, 5)
    // El índice 1 corresponde al segundo elemento de la lista
    val segundoNumero = numeros[1]
    //acceder al elemento 2 de la lista
    println(segundoNumero)  // Salida: 2

//Modificando los elementos de una lista
    val lista = mutableListOf("uno", "dos", "tres")
    // Modificar el elemento 1 de la lista
    lista[1] = "nuevo_dos"
    println(lista) // Imprime: [uno, nuevo_dos, tres]

    val list = mutableListOf("uno", "dos", "tres")
   // Utilizando la función set de la lista para modificar el elemento
    lista.set(1, "nuevo_dos")

    println(lista) // Imprime: [uno, nuevo_dos, tres]

    val listas = mutableListOf("uno", "dos", "tres")
    // Utilizando la función replace de la lista para modificar el elemento
    lista.replaceAll { elemento -> elemento.replace("dos", "nuevo_dos") }
    println(listas) // Imp rime: [uno, nuevo_dos, tres]

    val lis = listOf("a", "b", "c", "d")
    // recorrer la lista con un for
    for (elemento in lista) {
        println(elemento)
    }

    val listaa = listOf("a", "b", "c", "d")
    // recorrer la lista con un for y el índice
    for (indice in lista.indices) {
        println("El elemento en la posición $indice es ${lista[indice]}")

        }
        val listaee = listOf("a", "b", "c", "d")
        // recorrer la lista con un forEach
        lista.forEach {
            println(it)
    }

}