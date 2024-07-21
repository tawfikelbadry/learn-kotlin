package week1

import java.util.ArrayList
import java.util.stream.Collectors


var x = 5
var str: String = "Hello"

class Hell {

    private var help: String = "Help";
    private var go: Int = 45

}

fun main(args: Array<String>) {

    var x: Int =12;
    var y = 9
    println("Hello World!")
    x.plus(5)
    println(x)
    println(str)

    var list: List<String> = ArrayList()
    list = listOf("Hello", "Hoba", "Hello")
    list.plus("Hollo")
    list.minus("Hoba")
    val set = list.stream().collect(Collectors.toSet())

    println(set)


    val person = Person("Ali", 12)
    println(person)
    println(person.age)
    println(person.name)


}