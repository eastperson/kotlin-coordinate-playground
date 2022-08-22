package domain

import domain.figure.Line
import domain.figure.Position
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.offset
import org.junit.jupiter.api.Test

class LineTest {

    @Test
    fun `선의 길이를 구할 수 있다`() {
        val first = Position(10, 10)
        val second = Position(14, 15)
        val line = Line(first, second)
        assertThat(line.length()).isEqualTo(6.403124, offset(0.00009))
    }
}