package com.example.signal

import android.app.Application
import android.util.Log
import com.pika.lib_signal.SignalConst
import com.pika.lib_signal.SignalController

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("EdisonLi", "onRestart")
        SignalController.initSignal(
            intArrayOf(
                SignalConst.SIGQUIT,
                SignalConst.SIGABRT,
                SignalConst.SIGSEGV,
                SignalConst.SIGBUS,
                SignalConst.SIGHUP
            ), this, MyHandler()
        )
    }
}