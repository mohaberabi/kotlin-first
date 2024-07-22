package org.example.performance

import kotlin.system.measureTimeMillis


fun main() {


    val boxedIntArray = Array(100000) { 5 }

    val primitiveIntArray = IntArray(100000) { 5 }


    val boxedTime = measureTimeMillis {
        boxedIntArray.sum()
    }
    val primitiveTime = measureTimeMillis {
        primitiveIntArray.sum()
    }
    println("Boxed ${boxedTime}") //22

    println("Primitive ${primitiveTime}")//2
    // Primitives are faster
    val boxedAllocationTime = measureTimeMillis {
        Array(100000) { 5 }
    }
    // Int is being used as a primitive
    val primitiveAllocationTime = measureTimeMillis {
        IntArray(100000) { 5 }
    }
    println("Boxed allocation time: $boxedAllocationTime") // 4
    println("Primitive allocation time: $primitiveAllocationTime") // 0
    // Primitives are faster again

}