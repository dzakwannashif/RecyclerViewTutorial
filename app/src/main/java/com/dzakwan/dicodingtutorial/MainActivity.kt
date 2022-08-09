package com.dzakwan.dicodingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.dzakwan.dicodingtutorial.adapter.AdapterNabi
import com.dzakwan.dicodingtutorial.data.DNabi
import com.dzakwan.dicodingtutorial.data.DataNabi
import com.dzakwan.dicodingtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.title = "Nabi-Nabi"
        setContentView(binding.root)

        binding.rvOne.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 1)
            adapter = AdapterNabi(DataNabi.listName)
        }
    }
}