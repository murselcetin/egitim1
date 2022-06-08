package com.example.egitim1.standart_programlama

fun main(){
    val a = 40
    val b = 50

    val x = 90
    val y = 80

    println("a == b : ${a == b}")
    println("a != b : ${a != b}")
    println("a > b : ${a > b}")
    println("a >= b : ${a >= b}")
    println("a < b : ${a < b}")
    println("a <= b : ${a <= b}")

    println("a > b || x > y : ${a > b || x > y}") // OR (veya) : false - false : false olur. aksi true olur
    println("a > b && x > y : ${a > b && x > y }") // and (ve) : true - true : true olur. aksi false olur
}