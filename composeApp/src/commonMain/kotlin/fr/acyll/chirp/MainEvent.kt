package fr.acyll.chirp

sealed interface MainEvent {
    data object OnSessionExpired: MainEvent
}
