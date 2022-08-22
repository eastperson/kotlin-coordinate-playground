package domain

import domain.figure.Position
import domain.figure.Rectangle
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
/*
    좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다. #InputView
    좌표값을 네 개 입력한 경우, 네 점을 연결하는 사각형으로 가정한다. #InputView
    네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사한다. #Rectangle
    사각형인 경우 사각형의 넓이를 계산해서 출력한다. #Rectangle.area()
 */
class RectangleTest {

    @Test
    fun `사각형 넓이를 구할 수 있다`() {
        val rectangle = Rectangle(listOf(Position(10, 10), Position(22, 10), Position(22, 18), Position(10, 18)))
        assertThat(rectangle.area()).isEqualTo(96.0)
    }
}