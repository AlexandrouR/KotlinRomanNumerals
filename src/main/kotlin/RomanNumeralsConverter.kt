class RomanNumeralsConverter(private val algorithm: Algorithm) {
    fun convert(value: Int) {

        println(algorithm.compute(value))
    }

    fun convertMultiple(values: List<Int>) {
        for (value in values) {
            println(algorithm.compute(value))
        }
    }
}