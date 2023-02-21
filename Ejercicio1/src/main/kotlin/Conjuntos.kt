fun main() {
    //creando un conjunto
    val setDeColores = setOf("rojo", "verde", "azul")
    //En Kotlin, puedes crear un conjunto utilizando la función setOf()
    //o mutableSetOf()  dependiendo de si necesitas un conjunto de solo lectura o uno que puedas modificar.
println(setDeColores)
    val setDeNumeros = mutableSetOf(1, 2, 3, 4, 5)

    println(setDeNumeros)

    val conjunto = setOf("rojo", "verde", "azul")
    //recorriendo un conjunto con for
    for (elemento in conjunto) {
        println(elemento)


        val conjuntos = setOf("rojo", "verde", "azul")
    //recorriendo un conjunto con forEach
        conjunto.forEach {
            println(it)
        }
    }
}