package com.example.yemekapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.yemekapp.databinding.ItemFoodBinding
import com.example.yemekapp.model.FoodItem

class FoodAdapter(private val foodList: List<FoodItem>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(val binding: ItemFoodBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding = ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val item = foodList[position]
        holder.binding.apply {
            tvName.text = item.name
            tvDescription.text = item.description
            tvPrice.text = "${item.price} ₺"
            Glide.with(ivFood.context)
                .load(item.imageUrl)
                .into(ivFood)
        }
    }

    override fun getItemCount() = foodList.size
}
