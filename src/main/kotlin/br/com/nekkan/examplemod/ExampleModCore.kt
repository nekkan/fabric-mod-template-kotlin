package br.com.nekkan.examplemod

import net.fabricmc.api.ModInitializer
import net.minecraft.client.MinecraftClient

class ExampleModCore : ModInitializer {

    inline val minecraft: MinecraftClient
        get() = MinecraftClient.getInstance() ?: error("The class 'MinecraftClient' is not ready for use.")

    override fun onInitialize() {
        //
    }

}