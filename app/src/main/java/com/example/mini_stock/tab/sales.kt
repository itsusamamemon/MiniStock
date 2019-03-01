package com.example.mini_stock.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mini_stock.R
import com.ishaquehassan.recyclerviewgeneraladapter.RecyclerViewGeneralAdapter
import kotlinx.android.synthetic.main.sales.*

class sales :BaseFragment(){
    override fun getTitle(): String? = "Sales"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.sales,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        data class data(val img:Int,val title:String , val size:String , val price:String , val hot:Int)
        all_sales.adapter = RecyclerViewGeneralAdapter(
            arrayListOf(
                data(R.drawable.m1,"Potato (Alo)","1kg","Rs 300",R.drawable.high),
                data(R.drawable.m2,"Purple Grapes","1kg","Rs 1000",R.drawable.high),
                data(R.drawable.m3,"Yellow Apple","1kg","Rs 600",R.drawable.high),
                data(R.drawable.m4,"Red Apple","1kg","Rs 900",R.drawable.high),
                data(R.drawable.m5,"Fresh Coconut","1kg","Rs 550",R.drawable.high),
                data(R.drawable.m6,"Papaya","1kg","Rs 600",R.drawable.high),
                data(R.drawable.m7,"Banana","1kg","Rs 700",R.drawable.high),
                data(R.drawable.m1,"Potato","1kg","Rs 800",R.drawable.high),
                data(R.drawable.m2,"Graphes","1kg","Rs 1500",R.drawable.high)
            ),
            R.layout.sale_single,
            {itemData,viewHolder->
                val itemView = viewHolder.itemView

                itemView.findViewById<ImageView>(R.id.pimg).setImageResource(itemData.img)
                itemView.findViewById<ImageView>(R.id.hot).setImageResource(itemData.hot)
                itemView.findViewById<TextView>(R.id.title).text = itemData.title
                itemView.findViewById<TextView>(R.id.size).text = itemData.size
                itemView.findViewById<TextView>(R.id.price).text = itemData.price

            }
        )
        all_sales.layoutManager = LinearLayoutManager(context)

    }

}