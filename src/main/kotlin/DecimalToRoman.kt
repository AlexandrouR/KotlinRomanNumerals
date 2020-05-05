import java.lang.StringBuilder

class DecimalToRoman : Algorithm {

    override fun compute(number: Int): String {
        var remainder: Int = number
        val stringBuffer = StringBuilder()
        if (numberIsValid(number)) {
            for (value in RomanNumbers.values()) {
                var temp = calculateQuotient(remainder, value.decimalRepresentation)
                if (numberIsValid(temp)) {
                    while (temp > 0) {
                        stringBuffer.append(value)
                        temp--
                    }
                    remainder %= value.decimalRepresentation
                }
            }
            return stringBuffer.toString()
        }
        return ""
    }

    private fun numberIsValid(number: Int): Boolean {

        return number > 0
    }

    private fun calculateQuotient(dividend: Int, divisor: Int): Int {
        return dividend / divisor
    }

}