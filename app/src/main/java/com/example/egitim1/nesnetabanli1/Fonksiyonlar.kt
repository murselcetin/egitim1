package com.example.egitim1.nesnetabanli1

class Fonksiyonlar {
    fun selamla1(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }
    fun selamla2():String{
        val sonuc = "Merhaba Ahmet"
        return  sonuc
    }

    fun selamla3(isim:String){
        println("Merhaba $isim")
    }

    fun toplama(sayi1:Int, sayi2:Int) : Int {
        val toplam = sayi1 + sayi2
        return toplam
    }

    fun carp(sayi1: Int,sayi2: Int){
        println("Çarpma : ${sayi1 * sayi2}")
    }
    fun carp(sayi1: Int,sayi2: Double){
        println("Çarpma : ${sayi1 * sayi2}")
    }
    fun carp(sayi1: Int,sayi2: Int,isim: String){
        println("Çarpma : ${sayi1 * sayi2} - İşlem Yapan $isim")
    }
}