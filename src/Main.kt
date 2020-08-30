class Main {
    companion object {
        @JvmStatic

        fun main (args: Array<String>) {
            var username: String? = ""
            var guessNumber = GuessNumber()

            print("Username: ")
            username = readLine().toString()
            println("Halo $username")

            guessNumber.main()
        }
    }
}