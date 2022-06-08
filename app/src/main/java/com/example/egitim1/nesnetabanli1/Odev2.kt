package com.example.egitim1.nesnetabanli1

class Odev2 {
    fun soru1(derece: Double): Double {
        return ((derece * 1.8) + 32)
    }

    fun soru2(a: Int, b: Int) {
        println("Dikdörtgenin Çevresi : ${2 * (a + b)}")
    }

    fun soru3(faktoriyel: Int): Int {
        var sonuc = 1
        for (i in 1..faktoriyel) {
            sonuc *= i
        }
        return sonuc
    }

    fun soru4(kelime: String, harf: Char): Int {
        var sayac = 0
        val kelimeDizi = kelime.toCharArray()
        for (i in kelimeDizi) {
            if (i == harf)
                sayac++
        }
        return sayac
    }

    fun soru5(n: Int): Int {
        return ((n - 2) * 180)
    }

    fun soru6(gun: Int): Int {
        return if (gun < (160 / 8)) {
            10 * (gun * 8)
        } else {
            (160 * 10) + (((gun - (160 / 8)) * 8) * 20)
        }
    }

    fun soru7(kota: Int): Int {
        return if (kota <= 50) {
            100
        } else {
            100 + ((kota - 50) * 4)
        }
    }
}