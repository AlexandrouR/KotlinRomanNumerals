import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class DecimalToRomanTest {
    private val decimalToRoman = DecimalToRoman()

    companion object {
        @JvmStatic
        fun simpleCases() = listOf(
            Arguments.of(1, "I"),
            Arguments.of(5, "V"),
            Arguments.of(10, "X"),
            Arguments.of(50, "L"),
            Arguments.of(100, "C"),
            Arguments.of(500, "D"),
            Arguments.of(1000, "M")
        )
        @JvmStatic
        fun edgeCases() = listOf(
            Arguments.of(4, "IV"),
            Arguments.of(9, "IX"),
            Arguments.of(40, "XL"),
            Arguments.of(90, "XC"),
            Arguments.of(400, "CD"),
            Arguments.of(900, "CM")
        )

        @JvmStatic
        fun complexCases() = listOf(
            Arguments.of(4214, "MMMMCCXIV"),
            Arguments.of(1993, "MCMXCIII"),
            Arguments.of(2001, "MMI"),
            Arguments.of(640, "DCXL"),
            Arguments.of(65, "LXV")
        )

    }

    @Test
    fun testDecimalToRomanConversion() {
        Assertions.assertEquals("MCMXCIII", decimalToRoman.compute(1993))
    }

    @Test
    fun `when input is zero response should be an empty string`() {
        Assertions.assertEquals("", decimalToRoman.compute(0))
    }

    @ParameterizedTest
    @MethodSource("simpleCases")
    fun `test simple character conversion`(input: Int, expectedLetter: String) {
        Assertions.assertEquals(expectedLetter, decimalToRoman.compute(input))
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    fun `test edge cases where value is composed of two letters`(input: Int, expectedLetter: String) {
        Assertions.assertEquals(expectedLetter, decimalToRoman.compute(input))
    }

    @ParameterizedTest
    @MethodSource("complexCases")
    fun `test complex cases`(input: Int, expectedLetter: String) {
        Assertions.assertEquals(expectedLetter, decimalToRoman.compute(input))
    }

   }