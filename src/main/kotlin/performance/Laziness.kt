package org.example.performance


/**
 * by lazy() only works for val immutable properties
 * as the name says it is lazy so it will not be initialized unless it is called
 * firstly so it will remain keeping  lazy unless the code calls it then it is now initialized
 * for a better resources management , also very useful for startup time optimizations
 */


class Example {
    val lazyExample by lazy { "ZzZzZzZzZzZzZzZzZz" }

    fun wakeUp() {


        println(lazyExample)
    }
}

fun main() {


    val example = Example()

    example.wakeUp()
}