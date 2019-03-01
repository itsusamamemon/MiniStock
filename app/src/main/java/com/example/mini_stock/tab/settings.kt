package com.example.mini_stock.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mini_stock.R

class settings : BaseFragment(){
    override fun getTitle(): String? = "Setting"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.settings,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}