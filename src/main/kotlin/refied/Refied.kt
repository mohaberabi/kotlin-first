package org.example.refied


/**
 * Cannot check for instance of erased type: T
 * make the tge <T> reified and fun inline
 * fun <T> checkType(data: Any) = data is T
 */

inline fun <reified T> checkType(data: Any) = data is T


