package com.arpangroup.pureeats

import android.app.Application
import org.koin.core.context.startKoin

class PureEatsApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(routerInterfaces)
        }
    }
}