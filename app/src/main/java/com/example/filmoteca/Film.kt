package com.example.filmoteca

import java.util.*

data class Film(
    var title: String,
    var director: String,
    var year: Int,
    var genre: String,
    var format: String,
    var imdbUrl: Int,
    var comments: String) {
}