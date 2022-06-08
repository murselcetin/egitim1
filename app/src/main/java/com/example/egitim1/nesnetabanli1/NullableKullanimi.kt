package com.example.egitim1.nesnetabanli1

fun main() {
    var x = "Merhaba"

    var str1:String? = null

    str1 = "Merhaba"

    println("Sonuç 1 : ${str1?.trim()}")

    //println("Sonuç 2 : ${str1!!.trim()}")

    if (str1 != null){
        println("Sonuç 3 : ${str1.trim()}")
    }else{
        println("Sonuç nulldur")
    }

    str1?.let {
        println("Sonuç 4 : ${str1.trim()}")
    }
}