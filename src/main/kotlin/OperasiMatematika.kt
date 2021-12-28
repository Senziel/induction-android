fun main() {

    val result: Double = 10.0 / 3.0
    println(result)

    val result2 = 10 + 10 / 2
    println(result2)

    val result3 = -10 + -20
    println(result3)

    //Augmented Assigments
    var total: Int = 0

    val barang1 = 100
    total += barang1                                 //total = total + barang1

    val barang2 = 200
    total += barang2                                //total = total + barang2

    val barang3 = 300
    total += barang3                                //total = total + barang3

    println(total)

    //Unary Operations
    total++                                     //total = total + 1
    total--                                     //total = total - 1
    total--
    println(total)

    //! = boolean kebalikan
    val sehat = true
    println(!sehat)
}