fun main() {

    val nilai = "A"

    when (nilai){
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not bad")
        } else -> {
            println("Try Again Next Year")
        }
    }

    //When Expression Multiple Option
    when(nilai){
        "A", "B", "C" -> println("Selamat Anda Lulus")
        else -> println("Maaf Anda Tidak Lulus")
    }

    //When Expression IN
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Coba Tahun Depan")
    }

    //When Expression IS
    val name = "Eko"
    when (name){
        is String -> println("Name Is Strng")
        !is String -> println("Name Is Not String")
    }

    //When Tanda Variable - Mirip dengan If
    val HasilUjian = 85
    when {
        HasilUjian >= 85 -> println("Good Work!")
        HasilUjian >= 60 -> println("Try Harder!")
        else -> println("Try Again Next Year")
    }
}