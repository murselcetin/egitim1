package com.example.egitim1.nesnetabanli2

class ClassA : MyInterface {
    override val degisken: Int = 10

    override fun metod1() {
        println("Metod 1 Çalıştı")
    }

    override fun metod2(): String {
        return "Metod 2 Çalıştı"
    }
}