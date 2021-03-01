package br.com.nekkan.examplemod

import net.fabricmc.api.ModInitializer
import net.minecraft.client.MinecraftClient

class ExampleModCore {

    val minecraft: MinecraftClient
        get() = MinecraftClient.getInstance() ?: error("The class 'MinecraftClient' is not ready for use.")

    val initializer = ModInitializer {
        val version = minecraft.gameVersion
        println("Ready. Minecraft version: $version")
    }

}