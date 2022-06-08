plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-library`
    idea
}

allprojects {
    val libs = rootProject.libs

    dependencies {
        implementation(kotlin("stdlib-jdk8"))

        implementation(libs.kotlinx.coroutines.core)
        implementation(libs.korau)
        implementation(libs.korau.jvm)
    }
}
