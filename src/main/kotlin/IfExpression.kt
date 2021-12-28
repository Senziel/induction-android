fun main() {

    //if (kondisi harus boolean) {
        //jika kondisi bernilai true
        //maka isi blok if akan dieksekusi

    val nilai  = 90

    if (nilai > 80)
        println("MANTAP ANJAY")

    //if (kondisi harus boolean) {
        //jika kondisi bernilai true
        //maka isi blok if akan dieksekusi
    //} else {
    //  jika kondisi bernilai false
    // maka isi blok else akan dieksekusi

    val marks = 95
    if (marks > 90){
        println("Mantap bosque")
    } else {
        println("Try again next year")
    }

    //else if expression
    //if(kondisi harus boolean) {
        //jika kondisi 1 bernilai true
    //} else if (kondisi boolean 2) {
        //jika kondisi 2 berniai true
    //} else {
            //jika kondisi bernilai false

    val examValue = 65
    if (examValue > 87){
        println("Good Job")
    } else if ( examValue > 78){
        println("Not Bad")
    } else if (examValue > 70){
        println("Almost")
    } else {
        println("Try Again Next Year")
    }
}