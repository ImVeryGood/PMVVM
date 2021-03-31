package com.m.jmvvmlibrary

import android.app.Application
import android.content.Context

/**
 * createDate:2021/3/31
 * @author:spc
 * @describe：
 */
open class JApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        mContext = applicationContext
    }

    companion object {
        lateinit var mContext: Context
    }
}