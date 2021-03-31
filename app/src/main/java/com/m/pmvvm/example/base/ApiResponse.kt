package com.m.pmvvm.example.base

import com.m.jmvvmlibrary.base.net.bean.BaseResponse


/**
 * 作者　: spc
 * 描述　:服务器返回数据的基类
 * 如果你的项目中有基类，那美滋滋，可以继承BaseResponse，请求时框架可以帮你自动脱壳，自动判断是否请求成功，怎么做：
 * 1.继承 BaseResponse
 * 2.重写isSucces 方法，编写你的业务需求，根据自己的条件判断数据是否请求成功
 * 3.重写 getResponseCode、getResponseData、getResponseMsg方法，传入你的 code data msg
 */
data class ApiResponse<T>(val code: String, val msg: String, val result: T) : BaseResponse<T>() {

    //请你根据自己的业务需求来改变
    override fun isSuccess() = code == "200"

    override fun getResponseCode() = code

    override fun getResponseData() = result

    override fun getResponseMsg() = msg

}