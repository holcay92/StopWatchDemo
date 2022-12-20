package com.example.stopwatchdemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import java.util.Timer

class StopWatchService: Service() {
    override fun onBind(p0: Intent?): IBinder?= null
    private val timer = Timer()

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}