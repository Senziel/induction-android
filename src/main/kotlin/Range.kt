fun main() {
    val range = 1..100
    println(range.contains(20))
    println(range.contains(200))
    println(range.count())
    println(range.last)
    println(range.first)

    //function down to dan step
    val jarakangka = 1000 downTo 1 step 2
    println(range.count())
    println(range.contains(50))
    println(range.contains(2000))
    println(range.step)
}