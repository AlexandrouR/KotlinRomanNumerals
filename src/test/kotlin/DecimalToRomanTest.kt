import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DecimalToRomanTest {
    private val decimalToRoman = DecimalToRoman()

    @Test
    fun testDecimalToRomanConversion() {
        Assertions.assertEquals("MCMXCIII", decimalToRoman.compute(1993))
    }

    @Test
    fun tesWhenInputIsZero() {
        Assertions.assertEquals("", decimalToRoman.compute(0))
    }

    @Test
    fun testWhenInputIs1000() {
        Assertions.assertEquals("M", decimalToRoman.compute(1000))
    }

    @Test
    fun testWhenInputIs900() {
        Assertions.assertEquals("CM", decimalToRoman.compute(900))
    }

    @Test
    fun testWhenInputIs500() {
        Assertions.assertEquals("D", decimalToRoman.compute(500))
    }

    @Test
    fun testWhenInputIs400() {
        Assertions.assertEquals("CD", decimalToRoman.compute(400))
    }

    @Test
    fun testWhenInputIs100() {
        Assertions.assertEquals("C", decimalToRoman.compute(100))
    }

    @Test
    fun testWhenInputIs90() {
        Assertions.assertEquals("XC", decimalToRoman.compute(90))
    }

    @Test
    fun testWhenInputIs50() {
        Assertions.assertEquals("L", decimalToRoman.compute(50))
    }

    @Test
    fun testWhenInputIs10() {
        Assertions.assertEquals("X", decimalToRoman.compute(10))
    }

    @Test
    fun testWhenInputIs9() {
        Assertions.assertEquals("IX", decimalToRoman.compute(9))
    }

    @Test
    fun testWhenInputIs5() {
        Assertions.assertEquals("V", decimalToRoman.compute(5))
    }

    @Test
    fun testWhenInputIs4() {
        Assertions.assertEquals("IV", decimalToRoman.compute(4))
    }

    @Test
    fun testWhenInputIs1() {
        Assertions.assertEquals("I", decimalToRoman.compute(1))
    }

}