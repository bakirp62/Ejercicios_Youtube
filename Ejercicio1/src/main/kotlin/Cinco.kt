fun main() {

//condicional when
//1. Dado el siguiente cuadro:
//1. Lunes
//2. Martes
//3. Miercoles
//4. Jueves
//5. Viernes
//3. Estructuras de Control Kotlin 11
//6. Sabado
//7. Domingo
//Haga un algoritmo que solicite el ingreso de un número e indique el dia correspondiente, valide si el código no existe.
val daynum =5
    when(daynum){
        1 -> println("lunes")
        2 -> println("martes")
        3 -> println("miercoles")
        4 -> println("jueves")
        5 -> println("viernes")
        6 -> println("sabado")
        7 -> println("domingo")
        else -> println("dia invalido")
    }

}

