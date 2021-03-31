package com.m.jmvvmlibrary.base.repository

import android.util.Log
import com.m.jmvvmlibrary.JApplication
import com.m.jmvvmlibrary.base.net.ApiException
import com.m.jmvvmlibrary.base.net.bean.BaseResponse
import com.m.jmvvmlibrary.base.util.showToast

/**
 * createDate:2021/3/31
 * @author:spc
 * @describe：用于统一处理code
 */
open class BaseRepository {
    /**
     * 预处理数据(错误)
     * @param context 跳至登录页的上下文A
     */
    fun <T : Any> preprocessData(baseBean: BaseResponse<T>): T {
        Log.d("SSSSSSSSSSSSSS", "preprocessData: "+baseBean.getResponseData())
        return if (baseBean.isSuccess()) {// 成功
            // 返回数据
            baseBean.getResponseData()
        } else {// 失败
            // 抛出接口异常
            JApplication.mContext.showToast(baseBean.getResponseMsg())
            throw ApiException(baseBean.getResponseCode(), baseBean.getResponseMsg())
        }
    }
}