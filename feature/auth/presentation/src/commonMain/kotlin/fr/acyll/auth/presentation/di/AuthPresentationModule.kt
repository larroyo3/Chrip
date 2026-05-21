package fr.acyll.auth.presentation.di

import fr.acyll.auth.presentation.email_verification.EmailVerificationViewModel
import fr.acyll.auth.presentation.forgot_password.ForgotPasswordViewModel
import fr.acyll.auth.presentation.login.LoginViewModel
import fr.acyll.auth.presentation.register.RegisterViewModel
import fr.acyll.auth.presentation.register_success.RegisterSuccessViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authPresentationModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::RegisterSuccessViewModel)
    viewModelOf(::EmailVerificationViewModel)
    viewModelOf(::LoginViewModel)
    viewModelOf(::ForgotPasswordViewModel)
}