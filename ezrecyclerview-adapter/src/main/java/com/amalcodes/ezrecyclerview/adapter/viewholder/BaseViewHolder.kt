package com.amalcodes.ezrecyclerview.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.amalcodes.ezrecyclerview.adapter.entity.ItemEntity

abstract class BaseViewHolder<T : ItemEntity>(
    view: View
) : RecyclerView.ViewHolder(view) {

    abstract fun onBind(entity: T)

    abstract fun onBindListener(
        entity: T,
        listener: ViewHolderClickListener
    )
}