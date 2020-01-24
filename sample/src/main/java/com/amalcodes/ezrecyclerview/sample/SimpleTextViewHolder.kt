package com.amalcodes.ezrecyclerview.sample

import android.view.View
import com.amalcodes.ezrecyclerview.adapter.viewholder.BaseViewHolder
import com.amalcodes.ezrecyclerview.adapter.viewholder.ViewHolderClickListener
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_simple_text.view.*

class SimpleTextViewHolder(
    override val containerView: View
) : BaseViewHolder<SimpleTextEntity>(containerView), LayoutContainer {

    override fun onBind(entity: SimpleTextEntity) = containerView.run {
        tv_simple_text?.text = entity.text
    }

    override fun onBindListener(
        entity: SimpleTextEntity,
        listener: ViewHolderClickListener
    ) = containerView.run {
        tv_simple_text?.setOnClickListener {
            listener.onClick(it, entity)
        }
        Unit
    }
}