package com.example.mini_stock.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mini_stock.R
import com.ishaquehassan.recyclerviewgeneraladapter.RecyclerViewGeneralAdapter

import kotlinx.android.synthetic.main.product.*

class product : BaseFragment(){
    override fun getTitle(): String? ="Products"
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.product,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        data class data(val img:Int,val title:String,val price:String,val size:String)

        prod_view.adapter=RecyclerViewGeneralAdapter(
            arrayListOf(
                data(R.drawable.m1,"Potato (Alo)","Rs 500","1Kg"),
                data(R.drawable.m2,"Grapes","Rs 400","1Kg"),
                data(R.drawable.m3,"Apple","Rs 300","1Kg"),
                data(R.drawable.m4,"Red Apple","Rs 900","1Kg"),
                data(R.drawable.m5,"Coconut","Rs 1000","1Kg"),
                data(R.drawable.m6,"Papaya","Rs 300","1Kg")
            ),
            R.layout.product_single,
            {itemData,viewHolder->
                val itemView = viewHolder.itemView
                itemView.findViewById<ImageView>(R.id.imageView).setImageResource(itemData.img)
                itemView.findViewById<TextView>(R.id.title).text = itemData.title
                itemView.findViewById<TextView>(R.id.size).text = itemData.size
                itemView.findViewById<TextView>(R.id.price).text = itemData.price
            }
        )
        prod_view.layoutManager = GridLayoutManager(context,2)

    }

}