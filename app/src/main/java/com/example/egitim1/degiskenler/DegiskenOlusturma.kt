package com.example.egitim1.degiskenler

fun main() {
    var ogrenciAdi = "Mürsel"
    var ogrenciYas = 25
    var ogrenciBoy = 1.76
    var ogrenciBasHarf = 'M'
    var ogrenciDevamDurumu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)
    println(ogrenciDevamDurumu)
    println("----------------------")

    var urun_id : Int = 3416
    var urun_ad : String = "Kol Saati"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 149.99
    var urun_tedarikci : String = "Rolex"

    println("Ürün id $urun_id")
    println("Ürün adı $urun_ad")
    println("Ürün adet $urun_adet")
    println("Ürün fiyat $urun_fiyat ₺")
    println("Ürün tedarikçisi $urun_tedarikci")


    var a = 10
    var b = 20
    println("$a X $b = ${a*b}")

    //Sabitler
    println("----------Sabitler------------")
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)
    val numara = 90
    println(numara)

    //Tür Dönüşümü
    println("----------Tür Dönüşümü------------")
    // sayıdan sayıya
    val i = 42
    val d = 78.95
    val sonuc1 = i.toDouble()
    println(sonuc1)

    val sonuc2 = d.toInt()
    println(sonuc2)

    //sayıdan metine
    val sonuc3 = i.toString()//42
    val sonuc4 = d.toString()//78.95
    println(sonuc3)
    println(sonuc4)

    //metinden sayıya
    val yazi = "67.54x"
    val sonuc5 = yazi.toDoubleOrNull()

    if(sonuc5 != null)
        println(sonuc5)
    else println("Dönüşümde Hata Oluştu!")

    sonuc5?.let{
        println(sonuc5)
    }

}