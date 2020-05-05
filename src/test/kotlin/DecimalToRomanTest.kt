import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DecimalToRomanTest {
    private val decimalToRoman = DecimalToRoman()

    @Test
    fun testComputeZeroCase() {
        Assertions.assertEquals("", decimalToRoman.compute(0))
    }

    @Test
    fun testComputeSuccess() {
        Assertions.assertEquals("MCMXCIII", decimalToRoman.compute(1993))

    }


}