package org.example.inline


interface SingleAction {
    fun execute()
}


fun doSomething(
    action: SingleAction,
) {
    action.execute()
}


fun main() {
    doSomething(object : SingleAction {
        override fun execute() {
            println("Executing while also creating an object from [SingleAction]")
        }
    })
}