package com.example.recyclerviewexample.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample.SuperHero
import com.example.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit){
        binding.textVSuperHeroName.text = superHeroModel.superhero
        binding.textVRealName.text = superHeroModel.realName
        binding.textVPublisher.text = superHeroModel.publisher
        Glide.with(binding.imageVSuperHero.context).load(superHeroModel.image).into(binding.imageVSuperHero)

        binding.imageVSuperHero.setOnClickListener { Toast.makeText(binding.imageVSuperHero.context,superHeroModel.realName,Toast.LENGTH_SHORT).show() }
        itemView.setOnClickListener { onClickListener(superHeroModel) }
    }
}