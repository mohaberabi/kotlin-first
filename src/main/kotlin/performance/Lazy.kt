//package org.example.performance
//
//import java.io.Serializable
//import javax.swing.JOptionPane.UNINITIALIZED_VALUE
//
/**
 * kotlin stdlib
 */
//
//public fun <T> lazyy(initializer: () -> T): Lazy<T> {}
//
//
//private class SyncronizedLazy<out T>(
//    initializer: () -> T,
//    lock: Any? = null,
//) : Lazy<T>, Serializable {
//    private var initializer: (() -> T)? = initializer
//    private val lock = lock ?: this
//
//    @Volatile
//    private var _value: Any? = UNINITIALIZED_VALUE
//
//    override val value: T
//        get() {
//            val _v1 = _value
//            if (_v1 !== UNINITIALIZED_VALUE) {
//                return _v1 as T
//            }
//
//            return synchronized(lock = lock) {
//                val _v2 = _value
//                if (_v2 !== UNINITIALIZED_VALUE) {
//                    @Suppress("UNCHECKED_CAST") (_v2 as T)
//                } else {
//                    val typedValue = initializer!!()
//                    _value = typedValue
//                    initializer = null
//                    typedValue
//                }
//            }
//        }
//
//    override fun isInitialized(): Boolean = _value !== UNINITIALIZED_VALUE
//
//    override fun toString(): String = if (isInitialized()) value.toString() else "Lazy value not initialized yet."
//
////    private fun writeReplace(): Any = InitializedLazyImpl(value)
//}