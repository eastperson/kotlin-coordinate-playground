package domain.figure

import kotlin.math.abs

class Rectangle(
    private val positions: List<Position>
) : Figure {

    companion object {
        const val RECTANGLE_VERTEX_SIZE = 4
    }

    private val vertex: Vertex = Vertex(RECTANGLE_VERTEX_SIZE, positions)

    override fun area(): Double {
        val (x1, x2, y1, y2) = vertex.toRectangleComponent()
        return (abs(x1 - x2) * abs(y1 - y2)).toDouble()
    }
}