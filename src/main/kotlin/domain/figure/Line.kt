package domain.figure

import kotlin.math.pow
import kotlin.math.sqrt

class Line(
    private val first: Position,
    private val second: Position
) {

    fun length() = sqrt((first.x - second.x).toDouble().pow(2.0) + (first.y - second.y).toDouble().pow(2.0))
}