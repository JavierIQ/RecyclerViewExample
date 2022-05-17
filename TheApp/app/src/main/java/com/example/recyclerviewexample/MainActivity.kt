package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.adapter.SuperHeroAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.mainPage)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        var decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerVSuperHeroe.layoutManager = LinearLayoutManager(this)
        binding.recyclerVSuperHeroe.addItemDecoration(decoration)
        binding.recyclerVSuperHeroe.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList) { superHero ->
            onItemSelected(
                superHero
            )
        }
    }

    private fun onItemSelected(superHero: SuperHero){
        Toast.makeText(this,superHero.realName, Toast.LENGTH_SHORT).show()
    }

}