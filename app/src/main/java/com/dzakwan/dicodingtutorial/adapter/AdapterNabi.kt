package com.dzakwan.dicodingtutorial.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.dzakwan.dicodingtutorial.data.DNabi
import com.dzakwan.dicodingtutorial.databinding.ActivityMainBinding
import com.dzakwan.dicodingtutorial.databinding.RawNabiBinding

class AdapterNabi(private val listNabi: ArrayList<DNabi>)
    : RecyclerView.Adapter<AdapterNabi.MyViewHolder>() {
    inner class MyViewHolder(val binding: RawNabiBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder(
        RawNabiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listNabi[position]){
                tvNama.text = nama
            }
        }
    }

    override fun getItemCount() = listNabi.size
}