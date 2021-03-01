plugins {
    kotlin("jvm") version "1.4.30"
}

repositories {
    mavenCentral()
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}