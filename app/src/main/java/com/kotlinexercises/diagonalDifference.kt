package com.kotlinexercises
//import kotlin.collections.*
import kotlin.math.abs

/*
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.

    For example, the square matrix  is shown below:
        1 2 3
        4 5 6
        9 8 9
    The left-to-right diagonal =1+5+9 = 15.
    The right to left diagonal =3+5+9 = 17.
    Their absolute difference is |15-17| = 2.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var diagonalSum1:Int = 0
    var diagonalSum2:Int = 0

    for ((position, value) in arr.withIndex()){
            diagonalSum1 += value[position]
            diagonalSum2 += value[value.size-(position+1)]
    }
    return abs(diagonalSum1 - diagonalSum2)
}

fun main() {
    val values:Array<Array<Int>> = arrayOf(arrayOf(1,2,3), arrayOf(8,12,24),arrayOf(14,3,45))
    val values2:Array<Array<Int>> = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6),arrayOf(9,8,9))

    println(diagonalDifference(values)) // Diagonal1 = 1+12+45 = 58, Diagonal2 = 3+12+14=29, |58-29| = 29
    println(diagonalDifference(values2))
}
