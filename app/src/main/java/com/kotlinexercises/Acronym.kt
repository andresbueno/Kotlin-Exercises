package com.kotlinexercises
/*
    Convert a phrase to its acronym.

    Techies love their TLA (Three Letter Acronyms)!

    Help generate some jargon by writing a program that converts a long name like Portable Network Graphics to its acronym (PNG).

    Punctuation is handled as follows: hyphens are word separators (like whitespace); all other punctuation can be removed from the input.

    For example:

    Input	                  |  Output
    --------------------------|-----------
    As Soon As Possible	      |  ASAP
    Liquid-crystal display	  |  LCD
    Thank George It's Friday! |  TGIF
*/

fun main(){
    println( acronym("As Soon As Possible"))
    println( acronym("Liquid-crystal display"))
    println( acronym("Thank George It's Friday!"))
}
fun acronym(sentence:String):String{
    val splitSentence = sentence.split(" ","-")
    var acronymResult:String= ""
    splitSentence.forEach { acronymResult = acronymResult + ""+ it[0].toUpperCase() }

    return acronymResult
}