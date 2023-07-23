package KotlinBingo.src

class Piece {
    var used: Boolean = false
    var space_value: UByte = 0u

    fun called() {
        this.used = true
    }
}