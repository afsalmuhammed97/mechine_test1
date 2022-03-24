package com.practies.mechintestui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.practies.mechintestui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding

   private lateinit var simpleItemAdapter: SimpleItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
         binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()
                val count= listOf(1,2,3,4,5,6,7,8,9,10)
                        val students= listOf("student1","student1","student1","student1","student1","student1","student1","student1",)




                simpleItemAdapter=SimpleItemAdapter(count)
             binding.recyclerview.apply {
                 layoutManager= LinearLayoutManager(this@MainActivity)
                 adapter= simpleItemAdapter
             }


    }
}