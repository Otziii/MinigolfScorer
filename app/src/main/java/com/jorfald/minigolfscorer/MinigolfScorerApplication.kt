package com.jorfald.minigolfscorer

import android.app.Application

class MinigolfScorerApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        application = this
    }

    companion object {
        lateinit var application: Application
    }
}