import sun.misc.Version

//variable constant
const val APPLICATION = "Belajar Kotlin Basic"
const val Version   = "0.0.1"


fun main() {

    val firstName = "Senziel"
    val age = 24

    //variable nullable
    var name:String? = "Rena"
    name = null

    println(firstName)
    println(name?.length)
    println("$APPLICATION : $Version")
}