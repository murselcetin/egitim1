package com.example.egitim1.ileri

import java.lang.Exception

fun main() {
    val x = 10
    val y = 5

    try {
        println("Sonuç : ${x / y}")
        println("İşlem Tamam")
    } catch (e: Exception) {
        println("İkinci sayı sıfır olamaz")
    }
}