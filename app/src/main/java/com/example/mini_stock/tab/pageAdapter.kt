package com.example.mini_stock.tab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class pageAdapter(fm: FragmentManager, val myTabs:ArrayList<BaseFragment>) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment = myTabs[position]
    override fun getCount(): Int = myTabs.size
    override fun getPageTitle(position: Int): CharSequence? =  myTabs[position].getTitle()
}