package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.filmoteca.Film
import com.example.filmoteca.R

class FilmAdapter(private val filmList: List<Film>) : RecyclerView.Adapter<FilmViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        // En vez de tener que recojer el contexto como parámetro lo puedo
        // coger de cualquiera de las vistas del layout
        val layoutInflater = LayoutInflater.from(parent.context)
        return FilmViewHolder(layoutInflater.inflate(R.layout.item_film, parent, false))
    }
    //Va a pasar por cada uno de lo item y va a llamar a la función render()
    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item = filmList[position]
        holder.render(item)
    }

    //Devuelve el tamaño de la lista
    override fun getItemCount(): Int = filmList.size
}
