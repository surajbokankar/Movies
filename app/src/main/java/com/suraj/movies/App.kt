package com.suraj.movies

import android.app.Application
import android.content.Context
import com.suraj.movies.network.RetrofitClient

class App : Application() {

    companion object{
        lateinit var instance: App
        lateinit var mContext: Context

        fun setContext(context: Context) {
            mContext = context
        }

        fun getActivityContext(): Context {
            return mContext
        }

    }
    override fun onCreate() {
        super.onCreate()
        instance=this
        RetrofitClient.init("https://indee.free.beeceptor.com/my/api/")
   }
}