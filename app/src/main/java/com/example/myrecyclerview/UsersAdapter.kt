package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class UsersAdapter(val users: ArrayList<String>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName: TextView = itemView.findViewById(R.id.firstName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() =  users.size


    override fun onBindViewHolder(holder: UsersAdapter.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        holder.firstName.text = users[position]
    }
}