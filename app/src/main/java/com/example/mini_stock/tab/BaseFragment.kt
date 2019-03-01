package com.example.mini_stock.tab

import androidx.fragment.app.Fragment


abstract class BaseFragment: Fragment(){
    abstract fun getTitle():String?

}