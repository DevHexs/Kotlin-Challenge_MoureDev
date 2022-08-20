package com.hex.kotlinplayground

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main(){
    CalcularArea(Triangulo(10.0,5.0))
    CalcularArea(Cuadrado(4.0))
    CalcularArea(Rectangulo(5.0,7.0))
}

interface IPoligono {
    fun area(): Double
    fun printArea()
}

data class Triangulo(val base: Double, val altura: Double): IPoligono{

    override fun area(): Double {
        return ( base * altura ) / 2
    }

    override fun printArea() {
        println("Area del triangulo: ${area()}")
    }
}

data class Cuadrado(val lado: Double): IPoligono{

    override fun area(): Double {
        return lado * lado    }

    override fun printArea() {
        println("Area del cuadrado: ${area()}")
    }
}

data class Rectangulo(val largo: Double, val ancho: Double): IPoligono{

    override fun area(): Double {
        return largo * ancho
    }

    override fun printArea() {
        println("Area del cuadrado: ${area()}")
    }
}

fun CalcularArea(poligono: IPoligono): Double{
    poligono.printArea()
    return poligono.area()
}





