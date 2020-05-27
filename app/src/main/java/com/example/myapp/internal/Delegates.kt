package com.example.myapp.internal

import kotlinx.coroutines.*

// embed suspending function
fun <T> lazyDeferred(block: suspend CoroutineScope.() -> T): Lazy<Deferred<T>> {
    return lazy {
        //this coroutine will be launched only when the lazyDegerred is called and when the internal lazy is called
        // the whole this thing  will be launched only when its called the weather
        GlobalScope.async(start = CoroutineStart.LAZY) {
            block.invoke(this)
        }
    }
}