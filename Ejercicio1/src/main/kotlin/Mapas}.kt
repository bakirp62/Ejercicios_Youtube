fun main() {
    //creando un mapa
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    //accediendo a los valores del mapa
    println(map)

    //En Kotlin, puedes crear un mapa utilizando la función mapOf()
    //o mutableMapOf()
    //dependiendo de si necesitas un mapa de solo lectura o uno que puedas modificar.
    val mapaDePrecios = mutableMapOf("manzanas" to 1.50, "naranjas" to 2.00, "plátanos" to 0.75)
    println(mapaDePrecios)

    //Utilizando un bucle for con la función **`keys`** para recorrer las claves del mapa
    val mapaDeEdades = mapOf("Juan" to 25, "Ana" to 30, "Pedro" to 20)
    for (clave in mapaDeEdades.keys) {
        println("La edad de $clave es ${mapaDeEdades[clave]}")
    }

    //Utilizando un bucle for con la función entries para recorrer los pares clave-valor del mapa
    val mapaDePrecio = mapOf("manzanas" to 1.50, "naranjas" to 2.00, "plátanos" to 0.75)
    for ((clave, valor) in mapaDePrecios.entries) {
        println("El precio de $clave es $valor")
    }

    //Utilizando un bucle forEach para recorrer los pares clave-valor del mapa
    val mapaDeEdadest = mapOf("Juan" to 25, "Ana" to 30, "Pedro" to 20)
    mapaDeEdades.forEach { (clave, valor) ->
        println("La edad de $clave es $valor")
    }
}