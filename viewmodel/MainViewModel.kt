package com.example.yemekapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yemekapp.model.FoodItem

class MainViewModel : ViewModel() {

    private val _foodList = MutableLiveData<List<FoodItem>>()
    val foodList: LiveData<List<FoodItem>> get() = _foodList

    init {
        loadFoods()
    }

    private fun loadFoods() {
        _foodList.value = listOf(
            FoodItem("Burger", "Sucuklu cheddar burger", 129.99, "https://loremflickr.com/320/240/burger"),
            FoodItem("Pizza", "İnce hamur margarita", 149.99, "https://loremflickr.com/320/240/pizza"),
            FoodItem("Kebap", "Adana dürüm", 99.99, "https://loremflickr.com/320/240/kebab"),
            FoodItem("Lahmacun", "Bol acılı", 29.99, "https://loremflickr.com/320/240/lahmacun")
        )
    }
}
