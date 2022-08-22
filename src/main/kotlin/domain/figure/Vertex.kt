package domain.figure

/**
 * 구조분해 선언
 */
data class RectangleComponent(val x1: Int, val x2: Int, val y1: Int, val y2: Int)

class Vertex(
    private val vertexSize: Int,
    private var positions: List<Position> = listOf()
) {

    fun toRectangleComponent(): RectangleComponent {
        val xSet = this.positions.map { it.x }.distinct().toList()
        val ySet = this.positions.map { it.y }.distinct().toList()
        return RectangleComponent(xSet[0], xSet[1], ySet[0], ySet[1])
    }

    fun add(position: Position) {
        if (this.positions.size >= vertexSize) {
            throw IllegalArgumentException("꼭지점 개수를 초과했습니다.")
        }
        val mutableList = this.positions.toMutableList()
        mutableList.add(position)
        this.positions = mutableList.toList()
    }
}