package com.kotlinexercises

import kotlin.math.pow

/*
    Instructions
    An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.

    For example:

    9 is an Armstrong number, because 9 = 9^1 = 9
    10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
    153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190
*/

fun main() {
    //Armstrong Numbers 0, 153, 9474
    //Not Armstrong Numbers 9475, 100, 10

    val numbers:List<Int> = listOf(0, 153, 9474, 9475, 100, 10)
    numbers.forEach { println(checkArmstrongNumber(it)) }
}

fun checkArmstrongNumber(input: Int): Boolean {

    val digits = input.toString().map { it.toString().toInt() }
    val power = digits.size

    // Cálculo de la suma de las potencias
    val sum = digits.sumOf { it.toDouble().pow(power.toDouble()) }

    // Comparamos el número original con la suma
    return input == sum.toInt()
}