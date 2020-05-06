import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class DecimalToRomanTest {
    private val decimalToRoman = DecimalToRoman()

    companion object {
        @JvmStatic
        fun simpleCases() = listOf(
            Arguments.of(1, "I"),
            Arguments.of(4, "IV"),
            Arguments.of(5, "V"),
            Arguments.of(9, "IX"),
            Arguments.of(10, "X"),
            Arguments.of(40, "XL"),
            Arguments.of(50, "L"),
            Arguments.of(90, "XC"),
            Arguments.of(100, "C"),
            Arguments.of(400, "CD"),
            Arguments.of(500, "D"),
            Arguments.of(900, "CM"),
            Arguments.of(1000, "M")
        )

        @JvmStatic
        fun complexCases() = listOf(
            Arguments.of(3214, "MMMCCXIV"),
            Arguments.of(1993, "MCMXCIII"),
            Arguments.of(2001, "MMI"),
            Arguments.of(640, "DCXL"),
            Arguments.of(65, "LXV")
        )

        @JvmStatic
        fun bounds() = listOf(
            Arguments.of(0, ""),
            Arguments.of(3999, "")

        )
    }

    @ParameterizedTest
    @MethodSource("bounds")
    fun `when input is out of bounds return empty response`(input: Int, expectedLetter: String){
        Assertions.assertEquals(expectedLetter, decimalToRoman.compute(input))
    }

    @ParameterizedTest
    @MethodSource("simpleCases")
    fun `test simple value conversion`(input: Int, expectedLetter: String) {
        Assertions.assertEquals(expectedLetter, decimalToRoman.compute(input))
    }


    @ParameterizedTest
    @MethodSource("complexCases")
    fun `test complex cases`(input: Int, expectedLetter: String) {
        Assertions.assertEquals(expectedLetter, decimalToRoman.compute(input))
    }

}