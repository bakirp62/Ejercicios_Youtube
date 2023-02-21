fun main() {
    //creando un par
    val pair = Pair(10, 20)
    println(pair)

    //Accediendo a los elementos de un par
    //Propiedades first y second
    val par = "Hola" to 42

    println("El primer elemento es: ${pair.first}")
    println("El segundo elemento es: ${pair.second}")

    //No se puede modificar los valores 10 y 20 en el lugar. Pero se puede crear un nuevo par con valores actualizados utilizando la función copy()
    //proporcionada por la clase PairLa función copy()
    //devuelve un nuevo par con los mismos tipos de datos y un valor modificado

    val newPair = pair.copy(first = 30, second = 40)
    println(newPair)

    //Desestructuración de un par: La forma más sencilla de recorrer un par es utilizar la desestructuración
// en una sentencia for

    //val pr = 1 to 2
    //for ((key, value) in pr) {
    //println("Key: $key, Value: $value")

    //Extensiones de Pair Kotlin proporciona una serie de funciones de extensión para la clase
    //Pair, que incluyen la función forEach() para recorrer los valores del par.

    //val pa = 1 to 2
    //pa.forEach { (key, value) ->
    // println("Key: $key, Value: $value")

//Funciones útiles para trabajar con pares en Kotli
//first y second Las propiedades first y second se
// utilizan para obtener el primer y segundo elemento de un par, respectivamente.

    val pai = 1 to 2
    val first = pai.first // devuelve 1
    val second = pai.second // devuelve 2

    //component1() y component2() Las funciones component1() y component2() se utilizan para obtener el primer y segundo
    //elemento de un par, respectivamente. Estas funciones se utilizan comúnmente en la desestructuración.

    val pa = 1 to 2
    val (a, b) = pair // desestructuración
    val fir = pair.component1() // devuelve 1
    val secon = pair.component2() // devuelve 2


}




