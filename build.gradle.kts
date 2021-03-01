plugins {
    id("fabric-loom") version "0.6-SNAPSHOT"
    kotlin("jvm") version "1.4.30"
    kotlin("kapt") version "1.4.30"
}

val mixin_version: String by project

repositories {
    maven(url = "https://maven.fabricmc.net/") {
        name = "Fabric"
    }
    mavenCentral()
}

dependencies {
    kapt("net.fabricmc:sponge-mixin:$mixin_version")
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}