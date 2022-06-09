package com.example.egitim1.nesnetabanli2

fun main() {
    val topkapiSarayi = Saray(5, 300)
    val bogazVilla = Villa(true, 10)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)

    //Tip kontrolü
    if (topkapiSarayi is Saray) {
        println("Saraydır")
    } else {
        println("Saray değildir")
    }

    //Upcasting
    val ev: Ev = Saray(5, 40)

    //DownCasting
    val yeniEv = Ev(10)
    var saray = yeniEv as Saray
}