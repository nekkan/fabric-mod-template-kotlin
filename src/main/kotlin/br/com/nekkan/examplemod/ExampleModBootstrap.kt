@file:JvmName("ExampleModBootstrap")

package br.com.nekkan.examplemod

private val core by lazy { ExampleModCore() }

fun init() {
    core.initializer.onInitialize()
}
