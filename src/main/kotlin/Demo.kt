fun main() {
    val number = 1993
    val numbers = mutableListOf(1003, 195, 2000, 3000)
    val decimalToRoman = DecimalToRoman()
    val converter = RomanNumeralsConverter(decimalToRoman)
    converter.convert(number)
    converter.convertMultiple(numbers)

}