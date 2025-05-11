package com.example.yemekapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yemekapp.adapter.FoodAdapter
import com.example.yemekapp.databinding.ActivityMainBinding
import com.example.yemekapp.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.foodList.observe(this) { list ->
            binding.rvFoodList.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = FoodAdapter(list)
            }
        }
    }
}
