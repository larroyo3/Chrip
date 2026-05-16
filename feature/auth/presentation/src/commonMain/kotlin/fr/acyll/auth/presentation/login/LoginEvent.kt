package fr.acyll.auth.presentation.login

sealed interface LoginEvent {
    data object Success: LoginEvent
}