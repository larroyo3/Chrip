package fr.acyll.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform