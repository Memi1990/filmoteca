package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.filmoteca.FilmProvider
import com.example.filmoteca.databinding.ActivityMainBinding
import com.example.recyclerview.adapter.FilmAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        //initRecyclerView()
    }

    fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        //Coloca cada item en una rejilla
        //val manager = GridLayoutManager(this, 2)
        val decoration = DividerItemDecoration(this, manager.orientation)
        b.recyclerFilm.layoutManager = manager
        b.recyclerFilm.addItemDecoration(decoration)
        b.recyclerFilm.layoutManager = LinearLayoutManager(this)
        b.recyclerFilm.adapter = FilmAdapter(FilmProvider.filmList)

    }
}