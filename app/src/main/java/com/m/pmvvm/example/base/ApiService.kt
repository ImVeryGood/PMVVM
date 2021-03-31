package com.m.pmvvm.example.base

import com.m.pmvvm.example.base.ApiResponse
import com.m.pmvvm.example.bean.BannerBean
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * createDate:2021/3/30
 * @author:spc
 * @describe：
 */
interface ApiService {
    @GET("message/banner/query")
    suspend fun banner(@Query("type") type: String): ApiResponse<List<BannerBean>>

    @POST("/trade/card/list")
    suspend fun yPerConfig(): ApiResponse<List<String>>
}