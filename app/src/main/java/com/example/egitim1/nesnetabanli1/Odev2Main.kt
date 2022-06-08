package com.example.egitim1.nesnetabanli1

fun main() {
    val f = Odev2()

    println("34.5 Derece = ${f.soru1(34.5)} Fahrenhiet'dır.")

    f.soru2(4,5)

    println("5 Faktöriyel = ${f.soru3(5)}")

    println(f.soru4("aa",'a'))

    println("Üçgenin iç açıları toplamı = ${f.soru5(3)}")

    println("Maaşınız = ${f.soru6(25)}")

    println("İnternet Ücreti = ${f.soru7(60)}")
}