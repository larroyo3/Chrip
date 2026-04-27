package fr.acyll.auth.presentation.di

import fr.acyll.auth.presentation.register.RegisterViewModel
import fr.acyll.auth.presentation.register_success.RegisterSuccessViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authPresentationModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::RegisterSuccessViewModel)
}