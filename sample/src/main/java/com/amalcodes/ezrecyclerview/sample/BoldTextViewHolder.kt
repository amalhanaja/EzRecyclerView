package com.amalcodes.ezrecyclerview.sample

import android.view.View
import com.amalcodes.ezrecyclerview.adapter.viewholder.BaseViewHolder
import com.amalcodes.ezrecyclerview.adapter.viewholder.ViewHolderClickListener
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_bold_text.view.*

class BoldTextViewHolder(
    override val containerView: View
) : BaseViewHolder<BoldTextEntity>(containerView), LayoutContainer {

    override fun onBind(entity: BoldTextEntity) = containerView.run {
        tv_bold_text?.text = entity.text
    }

    override fun onBindListener(
        entity: BoldTextEntity,
        listener: ViewHolderClickListener
    ) = containerView.run {
        tv_bold_text?.setOnClickListener {
            listener.onClick(it, entity)
        }
        Unit
    }
}