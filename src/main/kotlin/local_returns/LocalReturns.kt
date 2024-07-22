package org.example.local_returns


/**
 * Normally, we can return only locally in the function's scope,
 * but because our functions are inlined, we can return outside. For example:
 */

private inline fun load(onEnd: () -> Unit) {
    onEnd()
}


//fun load(onEnd: () -> Unit) {
//    onEnd()
//}

fun main() {


    /**
     * this part of code is not allowed you must add [@load] eg
     * "name of the function executing the lambda"
     * after the return
     * as the function is not inlined
     *     load {
     *         return
     *     }
     */
    /**
     * now the [main] will return and will not continue executing
     */
    load {
        return
    }
    println("will i be called....?")
}