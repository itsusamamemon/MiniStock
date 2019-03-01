package com.example.mini_stock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mini_stock.tab.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pagerTabs = arrayListOf<BaseFragment>(

            home(),
            product(),
            sales(),
            settings()

        )
        ViewPage.adapter = pageAdapter(supportFragmentManager,pagerTabs)
        tab.setupWithViewPager(ViewPage)


    }

}
