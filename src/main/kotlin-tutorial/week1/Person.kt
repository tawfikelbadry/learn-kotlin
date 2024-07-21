package week1

data class Person(val name: String, val age: Int) {

    fun getMaxAge(): Int {
        return this.age * 3
    }

}

enum class Color {
    Red, Blue, Orange
}

fun updateWeather(degree: Int) {
    val (description, color) = when {
        degree < 10 -> "cold" to Color.Blue
        degree < 25 -> "mild" to Color.Orange
        else -> "hot" to Color.Red
    }
}

fun main() {
    val person1 = Person("Ali", 25)
    val person2 = Person("Andy", 22)

    println(person1.name + " : " + person1.age)
    println(person2.name + " : " + person2.age)

    println(person1.toString())
    println(person2)
    println(person1.getMaxAge())
    println(person2.getMaxAge())
}