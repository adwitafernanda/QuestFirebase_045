package com.example.questfirebase_045

import android.app.Application
import com.example.questfirebase_045.di.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: MahasiswaContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}