package com.amalcodes.ezrecyclerview.adapter.viewholder

import android.view.View
import com.amalcodes.ezrecyclerview.adapter.entity.ItemEntity

interface ViewHolderClickListener {
    fun onClick(view: View, item: ItemEntity)
}