object Versions {
    object Kotlin {
        const val kotlin = "1.6.10"
        const val kotlinx = "1.6.0"
    }
    internal object Audio {
        const val korau = "2.7.0" // From korge: https://github.com/korlibs/korge-next
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            plugin("kotlin-jvm", "org.jetbrains.kotlin.jvm").version(Versions.Kotlin.kotlin)

            library("kotlinx-coroutines-core", "org.jetbrains.kotlinx", "kotlinx-coroutines-core").version(Versions.Kotlin.kotlinx)
            library("korau-jvm", "com.soywiz.korlibs.korau", "korau-jvm").version(Versions.Audio.korau)
            library("korau", "com.soywiz.korlibs.korau", "korau").version(Versions.Audio.korau)
        }
    }
}

