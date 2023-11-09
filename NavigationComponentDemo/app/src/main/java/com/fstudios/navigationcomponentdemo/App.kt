package com.fstudios.navigationcomponentdemo

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.annotation.RequiresApi

const val CHANNEL_ID = "navigationComponentDemo"

class App : Application() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()

        val channel = NotificationChannel(CHANNEL_ID,"NavigationComponentDemo",NotificationManager.IMPORTANCE_DEFAULT)

        (getSystemService(NOTIFICATION_SERVICE) as NotificationManager).createNotificationChannel(channel)


    }
}