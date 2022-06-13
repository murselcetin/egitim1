package com.example.egitim1.collections

fun main() {
    val sayilar = ArrayList<Int>()

    val meyveler = ArrayList<String>()

    //Veri Ekleme
    meyveler.add("Elma")//0
    meyveler.add("Muz")//1
    meyveler.add("Kiraz")//3

    println(meyveler)

    meyveler[1] = "Yeni Muz"
    println(meyveler)

    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma işlemi
    println(meyveler.get(2))
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş kontrol : ${meyveler.isEmpty()}")
    println("İçeriyor mu : ${meyveler.contains("Kiraz")}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    //for each
    for (meyve in meyveler){
        println("Sonuç 1 : $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println("$indeks. -> : $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}