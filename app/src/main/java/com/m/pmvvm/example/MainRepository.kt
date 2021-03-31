package com.m.pmvvm.example

import com.m.jmvvmlibrary.base.repository.BaseRepository
import com.m.pmvvm.example.base.apiService

/**
 * createDate:2021/3/31
 * @author:spc
 * @describe：
 */
object  MainRepository : BaseRepository() {
    suspend fun getMyData() = preprocessData(apiService.yPerConfig())
    suspend fun getBanner(type: String) = preprocessData(apiService.banner(type))
}