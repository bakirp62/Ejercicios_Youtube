fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5)
// Modificando el primer elemento
    numeros[0] = 10

// Modificando el segundo elemento
    numeros[1] = 20

// Modificando el tercer elemento
    numeros[2] = 30
//modificando el array con un for
    for (i in numeros.indices) {
        numeros[i] = numeros[i] * 2
    }
}