package com.example.recyclerview.adapter

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.filmoteca.Film
import com.example.filmoteca.R
import com.example.filmoteca.databinding.ItemFilmBinding

class FilmViewHolder (view:View):RecyclerView.ViewHolder(view) {
    val b = ItemFilmBinding.bind(view)
    fun render(superHeroModel: Film){
        b.tvFilmTitle.text = superHeroModel.title
        b.tvFilmDirector.text = superHeroModel.director
        b.tvFilmYear.text = superHeroModel.year.toString()
        Glide.with(b.imvCaratula.context)
            .load(superHeroModel.imdbUrl)
            .error(R.drawable.error)
            .into(b.imvCaratula)
        b.imvCaratula.setOnClickListener {
            Toast.makeText(b.imvCaratula.context, superHeroModel.director,Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(b.imvCaratula.context, superHeroModel.title,Toast.LENGTH_SHORT).show()
        }
    }
}