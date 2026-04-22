package fr.acyll.core.data.di

import fr.acyll.core.data.auth.KtorAuthService
import fr.acyll.core.data.logging.KermitLogger
import fr.acyll.core.data.networking.HttpClientFactory
import fr.acyll.core.domain.auth.AuthService
import fr.acyll.core.domain.logging.ChirpLogger
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformCoreDataModule: Module

val coreDataModule = module {
    includes(platformCoreDataModule)

    single<ChirpLogger> { KermitLogger }
    single {
        HttpClientFactory(get()).create(get())
    }

    singleOf(::KtorAuthService) bind AuthService::class
}