package com.m.pmvvm

import android.content.Context
import com.m.jmvvmlibrary.JApplication

/**
 * createDate:2021/3/31
 * @author:spc
 * @describe：
 */
class MApp : JApplication() {
    override fun onCreate() {
        super.onCreate()
        mContext = applicationContext
    }

    companion object {
        lateinit var mContext: Context
    }
}