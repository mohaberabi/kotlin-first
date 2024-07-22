package org.example.noinline


private inline fun load(
    noinline onHalfLoaded: () -> Unit,
    onEnd: () -> Unit,
) {

    /**
     * we can not call the [onHalfLoaded] from a non inlined function
     * so we must add [noinline] keyword before it
     */
    fetchData(onHalfLoaded)
    onEnd()
}


private fun fetchData(
    onHalfLoaded: () -> Unit,
) {
    onHalfLoaded()
}