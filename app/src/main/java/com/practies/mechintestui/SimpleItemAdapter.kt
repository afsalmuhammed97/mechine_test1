package com.practies.mechintestui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practies.mechintestui.databinding.RecyclerViewItemBinding

class SimpleItemAdapter(val list:List<Int>):RecyclerView.Adapter<SimpleItemAdapter.ItemHolder>() {
    class ItemHolder( val binding:RecyclerViewItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemHolder {
       return ItemHolder(RecyclerViewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }


    override fun onBindViewHolder(holder: SimpleItemAdapter.ItemHolder, position: Int) {
                       val item=list[position]
             //holder.binding.nameText.text=item
                if(item%2==0){
                    holder.binding.text3.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.dot_circle_green,0)      //(R.drawable.dot_circle_green)
                }
       // setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drawableRight, 0);
    }

    override fun getItemCount()=list.size
}