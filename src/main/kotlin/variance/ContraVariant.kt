package org.example.variance


interface OutExample<out T> {
    fun produce(): T
    /**
     * we can not ever do like
     * fun produce(input: T)
     * because we declared that <T> is [out] using the [out] keyword
     * so this means it can only be produced not consumed
     */
}


class StringOutExample(
    private val message: String,
) : OutExample<String> {

    override fun produce(): String = message
}

fun main() {
    val example = StringOutExample("loser").produce()
    println(example)
}