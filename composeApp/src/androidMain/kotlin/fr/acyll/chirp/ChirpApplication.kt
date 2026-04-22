package fr.acyll.chirp

import android.app.Application
import fr.acyll.chirp.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class ChirpApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@ChirpApplication)
            androidLogger()
        }
    }
}