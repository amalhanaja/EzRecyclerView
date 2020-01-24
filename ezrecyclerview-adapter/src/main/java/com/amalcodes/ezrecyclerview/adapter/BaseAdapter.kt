package com.amalcodes.ezrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amalcodes.ezrecyclerview.adapter.entity.ItemEntity
import com.amalcodes.ezrecyclerview.adapter.viewholder.BaseViewHolder
import com.amalcodes.ezrecyclerview.adapter.viewholder.ViewHolderClickListener

abstract class BaseAdapter<T : ItemEntity> constructor(
    private val data: MutableList<T> = mutableListOf()
) : RecyclerView.Adapter<BaseViewHolder<T>>() {

    private var _onViewHolderClickListener: ViewHolderClickListener? = null

    fun setOnViewHolderClickListener(listener: ViewHolderClickListener) {
        _onViewHolderClickListener = listener
    }

    fun setOnViewHolderClickListener(listener: (view: View, item: ItemEntity) -> Unit) {
        _onViewHolderClickListener = object : ViewHolderClickListener {
            override fun onClick(view: View, item: ItemEntity) {
                listener.invoke(view, item)
            }
        }
    }

    fun submitList(list: List<T>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    abstract fun onCreateBaseViewHolder(view: View, layoutRes: Int): RecyclerView.ViewHolder

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T> {
        val view = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        val viewHolder = onCreateBaseViewHolder(view, viewType)
        check(viewHolder is BaseViewHolder<*>) {
            "ViewHolder is not Extends from BaseViewHolder"
        }
        return viewHolder as BaseViewHolder<T>
    }

    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) {
        val item = getItem(position)
        holder.onBind(item)
        _onViewHolderClickListener?.let {
            holder.onBindListener(item, it)
        }

    }

    override fun getItemCount(): Int = data.count()

    override fun getItemViewType(position: Int): Int {
        return getItem(position).layoutRes
    }

    private fun getItem(position: Int): T {
        return data[position]
    }
}