package com.github.coderlang.ktfactory.annotation

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class Factory(val key: String, val factory:String = "")