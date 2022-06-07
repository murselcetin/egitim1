package com.example.egitim1.nesnetabanli1

fun main() {
    val f = Fonksiyonlar()
    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    f.selamla3("Zeynep")

    val gelenToplam = f.toplama(3 ,5)
    println("Gelen Toplam : $gelenToplam")

    f.carp(3,5,"Mürsel")

}