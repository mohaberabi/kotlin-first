package org.example.variance


interface InExample<in T> {
    fun consume(input: T)
    /**
     * we can not ever do like
     * fun consume(input:T):T
     * because we declared that <T> is [in] using the [in] keyword
     * so this means it can only be consumed not produced
     */
}


class StringInExample : InExample<String> {

    override fun consume(input: String) {
        println(input)
    }
}

fun main() {
    val example = StringInExample()
    example.consume("loser")
}