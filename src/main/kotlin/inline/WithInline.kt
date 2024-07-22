package org.example.inline


private inline fun load(
    action: () -> Unit,
) {
    action()
}


fun main() {

    load {
        println(
            "now the compiler executes code at the caller site" +
                    " without producing function it self," +
                    "no object creating "
        )
    }
}