fun main() {
    var firstname : String = "Asuna"
    var lastname  : String = "Yuuki"

    var address: String = """
        |Jalan Kenangan, RT 02 RT 04
        |Aincrad
        |12th Floor
        """.trimMargin()

    println(firstname)
    println(lastname)
    println(address)

    //join 2 or more String
    var fullName: String ="$firstname $lastname"
    println(fullName)

    //menghitung karakter pada suatu String
    var desc: String ="$fullName jumlah karakter ada = ${fullName.length}"
    println(desc)
}