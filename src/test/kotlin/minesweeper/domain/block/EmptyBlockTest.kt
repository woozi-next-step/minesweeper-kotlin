package minesweeper.domain.block

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

@DisplayName("일반 셀(Cell)")
internal class EmptyBlockTest {

    @ParameterizedTest(name = "입력 값: {0}, {1}")
    @CsvSource(value = ["0:0", "10:10", "0:10", "10:0"], delimiter = ':')
    fun `위치로 이루어진다`(x: Int, y: Int) {
        val position = Position(x, y)

        val cell = EmptyBlock(position)

        assertAll(
            { assertThat(cell).isNotNull },
            { assertThat(cell).isExactlyInstanceOf(EmptyBlock::class.java) },
        )
    }

    @ParameterizedTest(name = "입력 값: {0}, {1}")
    @CsvSource(value = ["0:0", "10:10", "0:10", "10:0"], delimiter = ':')
    fun `지뢰가 아니다`(x: Int, y: Int) {
        val position = Position(x, y)

        val cell = EmptyBlock(position)

        assertThat(cell.isMines()).isFalse
    }
}