
fun  main() {
    var age: Int = 200
    var sample: Float = 10.11F

    println(age)
    println(sample)

    //literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b00010010

    println(binaryLiteral)

    //underscore
    var price: Long = 9_000_000_000L
    println(price)

    //conversion
    var priceInt: Int = price.toInt()
    println(priceInt)

    var doublebinary: Double = binaryLiteral.toDouble()
    println(doublebinary)



}