package com.m.pmvvm.example

import android.view.View
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.m.jmvvmlibrary.base.ui.BaseActivity
import com.m.pmvvm.R
import com.m.pmvvm.databinding.ActivityMainBinding
import com.m.pmvvm.example.model.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNREACHABLE_CODE")
class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override fun layoutId() = R.layout.activity_main

    override fun create() {
        observe()

    }

    private fun observe() {
        mViewModel.run {
            listArticle.observe(this@MainActivity, Observer {
                name_text.text = it[0].imgUrl
                Glide.with(this@MainActivity).load("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png").into(image)
            })
            list.observe(this@MainActivity, Observer {
                age.text = it[0]
            })
        }

    }

    fun clickData(view: View) {
        mViewModel.getNetData("index")
    }
}