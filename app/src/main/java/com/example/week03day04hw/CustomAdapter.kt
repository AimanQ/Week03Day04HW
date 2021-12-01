package com.example.week03day04hw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val array:ArrayList<Phone>):RecyclerView.Adapter<CustomAdapter.DataHolder>() {

    //هذه الدالة تقوم بتجهيز Custom layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
        val dataHolder:DataHolder = DataHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_layout,parent,false))
        return dataHolder
    }

    //هذه الدالة تقوم بتغيير قيمة كل خلية
    override fun onBindViewHolder(holder: DataHolder, position: Int) {
        val phone:Phone = array.get(position)

        holder.phoneImageView.setImageResource(phone.phoneImage)
        holder.phoneNameTextView.setText(phone.phoneName)
        holder.phoneBrandTextView.setText(phone.phoneBrand)

    }

    //هذه الدالة تحدد عدد مرات تكرار الخلية
    override fun getItemCount(): Int {
        return array.size
    }

    class DataHolder(view:View):RecyclerView.ViewHolder(view){
        val phoneImageView:ImageView = view.findViewById(R.id.ivPhone)
        val phoneNameTextView:TextView = view.findViewById(R.id.tvPhoneName)
        val phoneBrandTextView:TextView = view.findViewById(R.id.tvBrand)

    }

}