fun main() {

    val names: Array<String> = arrayOf("Mio", "Jun", "Rikka")
    //names.set(0, "Rudi")
    //names[0] = "Rudi"
    println(names[2])

    val nilai: Array<Int> = arrayOf(10, 9, 8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    //Array Nullable
    val members: Array<String?> = arrayOfNulls(10)
    members[0] = "Senziel"
    members[1] = "Mio"
    members[2] = "Jun"
    members[3] = "Rikka"
    members[4] = "Jessica"
    members[5] = "Hiiro"
    members[6] = null
    println(members[6])
    println(members.size)
}