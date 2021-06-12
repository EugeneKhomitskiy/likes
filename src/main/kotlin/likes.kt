fun main() {
    while (true) {
        println("Введите количество лайков:")
        val likes = readLine()!!.toInt()
        val result = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"
        println("Ваша запись понравилась $likes $result")
    }
}