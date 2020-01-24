package com.amalcodes.ezrecyclerview.sample

import com.amalcodes.ezrecyclerview.adapter.entity.ItemEntity

data class BoldTextEntity(
    val text: String
) : ItemEntity {
    override val layoutRes: Int
        get() = R.layout.item_bold_text
}