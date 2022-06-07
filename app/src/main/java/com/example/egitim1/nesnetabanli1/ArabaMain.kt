package com.example.egitim1.nesnetabanli1

fun main() {
    val bmw = Araba("kırmızı",0,false)

    bmw.bilgiAl()

    bmw.renk = "Mavi"
    bmw.hiz = 5
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()

    val sahin = Araba("beyaz",100,true)

    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(30)
    sahin.bilgiAl()
    sahin.yavasla(10)
    sahin.bilgiAl()
}