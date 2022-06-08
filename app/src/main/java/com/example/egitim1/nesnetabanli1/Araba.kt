package com.example.egitim1.nesnetabanli1

class Araba(var renk:String,var hiz:Int, var calisiyorMu:Boolean) {

    init {// Constructor : Primary Constructor
        println("Nesne oluştu")
    }

    fun calistir(){
        calisiyorMu = true
        hiz = 5
    }
    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }
    fun hizlan(kacKm:Int){
        hiz += kacKm
    }
    fun yavasla(kacKm:Int){
        hiz -= kacKm
    }
    fun bilgiAl(){
        println("******************************")
        println("Renk : ${(renk)}")
        println("Hız : ${(hiz)}")
        println("Çalışıyor mu : ${(calisiyorMu)}")
    }
}