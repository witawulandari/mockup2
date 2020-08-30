import java.lang.Math.abs
import java.util.ArrayList

class GuessNumber {
    fun main() {
        val n = arrayListOf<Int>(0,1,2,3,4,5,6,7,8,9)
        val random = n.random()
        val computer = n.random()
        var attempts = 0
        var scorePemain = ""
        var scoreComp = ""
        val score = +1

        for (i in 1..3) {

            println()
            println("Permainan ke-$i")
            println("Pilih angkamu dari 0-9: ")
            attempts = readLine()!!.toInt()
            println("Pilihan komputer: $computer")
            println()
            println("Angka Random: $random ")
            println()

            if ((abs(random - attempts) < abs(random - computer)) || (attempts == random)) {
                scorePemain += score
                print("kamu menang")
            } else if ((abs(random - computer) < abs(random - attempts)) || (attempts == random)) {
                scoreComp += score
                print("komputer menang")
            }
            println()
        }

        println()
        if (scorePemain == scoreComp) {
            print("Hasil akhir : DRAW")
        } else if (scorePemain > scoreComp) {
            print("Hasil akhir: Kamu Menang!")
        }else {
            print("Hasil akhir: Komputer Menang!")
        }
        println()

    }
}