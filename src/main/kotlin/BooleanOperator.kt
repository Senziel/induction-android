fun main() {

    val finalExam = 80
    val kehadiran = 80                              //Ini inputan nilai user yang akan di-compare
    val nilaiEkskul = 90

    val passfinalExam = finalExam > 75              //Ini nilai minimum untuk lulusnya
    val passkehadiran = kehadiran > 75              //Ini juga nilai minimum untuk lulus absensinya
    val passEkskul  = nilaiEkskul > 80

    val pass = passfinalExam && passkehadiran && passEkskul     //case apabila ada 3 pernyataan atau lebih yang dicompare
    //operasi perbandingannya = ((passfinalExam && passkehadiran) && passEkskul)
    println(pass)
}