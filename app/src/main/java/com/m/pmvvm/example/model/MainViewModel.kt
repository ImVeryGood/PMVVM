package com.m.pmvvm.example.model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.m.jmvvmlibrary.base.model.BaseViewModel
import com.m.pmvvm.example.AppConstant
import com.m.pmvvm.example.MainRepository
import com.m.pmvvm.example.bean.BannerBean
import kotlinx.coroutines.delay

/**
 * createDate:2021/3/31
 * @author:spc
 * @describe：
 */
class MainViewModel : BaseViewModel() {

    var textRigger = MutableLiveData<String>()
    val listArticle = MutableLiveData<List<BannerBean>>()
    val list = MutableLiveData<List<String>>()
    fun getStrings() {
        launch(
            block = {
                delay(2000)
                textRigger.postValue("666")
            }
        )


    }

    fun getNetData(type: String) {
        launch(
            block = {
                val result = async { MainRepository.getBanner(type) }
                val res = async { MainRepository.getMyData() }
                listArticle.value = result.await()
                list.value = res.await()
                Log.d(AppConstant.TAG, "getNetData: " + result.await()[0].imgUrl)
            },
            isShowLoading = true
        )

    }
}