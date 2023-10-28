fun main() {
    fun zad2(string: String): String {
        var r = ""
        val charCount = mutableMapOf<Char, Int>()
        string.forEach { char ->
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }
        charCount.toSortedMap().forEach { (char, count) ->
            r += "$char - $count\n"
        }
        return r
    }
    println(zad2(readln()))
}