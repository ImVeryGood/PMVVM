package com.m.pmvvm.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.m.jmvvmlibrary.base.ui.BaseFragment
import com.m.pmvvm.R
import com.m.pmvvm.databinding.FragmentBlankBinding
import com.m.pmvvm.example.model.MainViewModel


class BlankFragment : BaseFragment<MainViewModel, FragmentBlankBinding>() {

    override fun layoutId() = R.layout.fragment_blank


    override fun createObserve() {
        TODO("Not yet implemented")
    }

    override fun initView(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

}