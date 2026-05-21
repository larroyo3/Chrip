package fr.acyll.auth.presentation.forgot_password

import androidx.compose.foundation.text.input.TextFieldState
import fr.acyll.core.presentation.util.UiText

data class ForgotPasswordState(
    val emailTextFieldState: TextFieldState = TextFieldState(),
    val isLoading: Boolean = false,
    val errorText: UiText? = null,
    val canSubmit: Boolean = false,
    val isEmailSentSuccessfully: Boolean = false
)