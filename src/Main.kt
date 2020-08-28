class Main {

    private var userName = ""
    private var userList = mutableListOf<User>



    @JvmStatic
    fun main() {
        println ("masukkan nama pemain")
        do {
            print("Username: ")
            userName = readLine().toString()
            game()
            println("Halo $userName")
        }
    }


    fun game(args:Array<String>){
        val number = Random().nextInt(9)

        var guess: Int
        var attempts= 0

        while (true) {
            print("masukkan angka pilihan kamu: ")
            guess = readLine()!!.toInt()

            when (guess.compareTo(number)) {
                -1 -> {
                    println("angka kurang"); attempts++
                }
                0 -> {
                    attempts++; println("angka benar"); return
                }
                +1 -> {
                    println ("angka terlalu besar"); attempts++
                }
            }

        }

    }
}