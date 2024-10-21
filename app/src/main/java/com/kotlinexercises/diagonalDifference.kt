package com.kotlinexercises
//import kotlin.collections.*
import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
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

    println(diagonalDifference(values)) // Diagonal1 = 1+12+45 = 58, Diagonal2 = 3+12+14=29, |58-29| = 29
}
