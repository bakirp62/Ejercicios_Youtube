fun main() {
   //condicinales Multiples

    // haga un algoritmo que calcule el promedio  de 3 notas y si el promedio es mayor a 3.5 indique que gana la materia
    //si el promedio es mayor a 2 y menor o igual a 3.5 entonces indique que puede recuperar
    val num1 = 2.0
    val num2 =1.0
    val num3 = 1.0
    val prom = (num1 +num2+num3)/3
    if (prom > 3.5){
        println("gana la materia")

    }else if (prom > 2){
        println("puede recuperar")
    }else{
        println("perdio la materia")
    }

    }
