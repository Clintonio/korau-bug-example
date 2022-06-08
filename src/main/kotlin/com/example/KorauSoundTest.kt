package com.example

import com.soywiz.korau.sound.readMusic
import com.soywiz.korau.sound.readSound
import com.soywiz.korio.file.std.resourcesVfs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val coroutineScope = CoroutineScope(Dispatchers.IO)
    coroutineScope.launch {
        playMusic("music.mp3")
        repeat(100) {
            delay(1000)
            playSound("eat.mp3")
        }
    }
    while(true) {}
}

suspend fun playMusic(name: String) {
    println("Playing music $name")
    resourcesVfs[name].readMusic().playForever()
}

suspend fun playSound(name: String) {
    println("Playing sound $name")
    resourcesVfs[name].readSound().play()
}
