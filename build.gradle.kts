plugins {
    id("fabric-loom") version "0.6-SNAPSHOT"
    kotlin("jvm") version "1.4.30"
    kotlin("kapt") version "1.4.30"
}

val minecraft_version: String by project

val fabric_version: String by project

val loader_version: String by project

val mixin_version: String by project

val yarn_mappings: String by project

repositories {
    maven(url = "https://maven.fabricmc.net/") {
        name = "Fabric"
    }
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:$minecraft_version")
    mappings("net.fabricmc:yarn:$yarn_mappings:v2")
    modImplementation("net.fabricmc:fabric-loader:$loader_version")
    modImplementation("net.fabricmc.fabric-api:fabric-api:$fabric_version")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.4.30+build.2")
    kapt("net.fabricmc:sponge-mixin:$mixin_version")
}

tasks.processResources {
    inputs.property("version", project.version)
    filesMatching("fabric.mod.json") {
        expand("version" to project.version)
    }
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}