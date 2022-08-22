package domain.figure

class Position(
    val x: Int,
    val y: Int
) {

    companion object {
        const val MAX_VALUE = 24
        const val MIN_VALUE = 0
    }

    init {
        require(x in MIN_VALUE..MAX_VALUE) { "X 좌표는 24를 넘으면 안됩니다." }
        require(y in MIN_VALUE..MAX_VALUE) { "Y 좌표는 24를 넘으면 안됩니다." }
    }
}