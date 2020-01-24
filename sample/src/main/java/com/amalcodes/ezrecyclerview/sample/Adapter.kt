package com.amalcodes.ezrecyclerview.sample

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.amalcodes.ezrecyclerview.adapter.BaseAdapter
import com.amalcodes.ezrecyclerview.adapter.entity.ItemEntity

class Adapter : BaseAdapter<ItemEntity>() {
    override fun onCreateBaseViewHolder(view: View, layoutRes: Int): RecyclerView.ViewHolder {
        return when (layoutRes) {
            R.layout.item_simple_text -> SimpleTextViewHolder(view)
            R.layout.item_bold_text -> BoldTextViewHolder(view)
            else -> throw IllegalArgumentException("unexpected view holder")
        }
    }
}