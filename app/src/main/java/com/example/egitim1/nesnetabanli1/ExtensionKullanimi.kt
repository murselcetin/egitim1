package com.example.egitim1.nesnetabanli1

fun main() {
    val sonuc = 5 carpi 2//5.carpi(2)
    println("Gelen sonuç : $sonuc")
}

infix fun Int.carpi(sayi:Int) : Int{
    return this * sayi
}