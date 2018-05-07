fun main(args: Array<String>) {
    println("Hello World!")

    val name = "Rajesh"

    var age = 46

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Integer: " + bigInt);
    println("Smallest Integer: $smallInt");

    if(true is Boolean)
        print("true is Boolean \n")

    var letterGrade: Char = 'A'

    println("A is a Char: ${letterGrade is kotlin.Char}")

    println("3.14 to an integer: " + 3.14.toInt())
    println("A to an integer: " + 'A'.toInt())
    println("65 to an char: " + 65.toChar())
    println("55 + 200 = ${55 + 200}")

    var lString = """This is a
        very very long
        multiline string
        with no ending in sight"""

    println("The length of the long string = ${lString.length}")

    val aStr: String = "A is a string"
    val bStr: String = "a is a string"

    println("String equals: ${aStr.equals(bStr)}")
    println("String compare to: ${"As".compareTo("Is")}")

    println("Index of a string: ${aStr[5]}")

    println("Substring between 2 to 7: ${aStr.subSequence(2,8)}")

    println("Searching for a word in string: ${aStr.contains("is")}")



}