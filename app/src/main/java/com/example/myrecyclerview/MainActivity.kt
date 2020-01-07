package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users: ArrayList<String> = ArrayList()

        for (x in 1..50){
            users.add("User # $x")
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UsersAdapter(users)

    }
}
