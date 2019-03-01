package com.example.mini_stock.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mini_stock.R

class home : BaseFragment(){
    override fun getTitle(): String? = "Home"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }

}