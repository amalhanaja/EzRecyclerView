package com.amalcodes.ezrecyclerview.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amalcodes.ezrecyclerview.adapter.entity.ItemEntity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val adapter: Adapter by lazy {
        Adapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rv?.adapter = adapter
        val list = generateDummyItem()
        adapter.submitList(list)
    }

    private fun generateDummyItem(): List<ItemEntity> {
        return (1..20).map {
            if (it % 3 == 0) {
                BoldTextEntity("Bold Text $it")
            } else {
                SimpleTextEntity("Simple Text $it")
            }
        }
    }
}
