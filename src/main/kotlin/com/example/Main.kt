package com.example

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

fun main(args: Array<String>) {
    val config = LwjglApplicationConfiguration()
    config.title = "Test"
    config.width = 640
    config.height = 480
    LwjglApplication(App(), config)
}