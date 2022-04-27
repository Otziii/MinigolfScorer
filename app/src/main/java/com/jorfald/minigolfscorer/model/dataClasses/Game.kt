package com.jorfald.minigolfscorer.model.dataClasses

data class Game(
    val gameId: String,
    val gameName: String,
    val created: Long,
    val isActive: Boolean
)
