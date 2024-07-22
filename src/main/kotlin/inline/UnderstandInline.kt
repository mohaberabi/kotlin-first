package org.example.inline


private fun load(action: () -> Unit) {
    action()
}


fun main() {

    load {
        println(
            "this lambada creates a new" +
                    " object in order to be executed " +
                    "[refer to WithoutKotlin.kt] to understand "
        )
    }
}