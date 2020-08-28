interface Interface {

    interface Presenter {
        fun guess (guessnumber: Int)
    }

    interface View {
        fun scoreResult(score: Int)
    }
}