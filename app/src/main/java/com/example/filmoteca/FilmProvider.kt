package com.example.filmoteca

class FilmProvider {
    companion object {
        val filmList = listOf<Film>(
            Film(
                "Regreso al futuro",
                "Robert Zemeckis",
                1985,
                "SciFi",
                "Digital",
                R.drawable.backtothefuture,
                ""
             ),
            Film(
                "Regreso al futuro II",
                "Robert Zemeckis",
                1989,
                "SciFi",
                "Digital",
                R.drawable.backtothefutureii,
                ""
            ),
            Film(
                "Regreso al futuro III",
                "Robert Zemeckis",
                1990,
                "SciFi",
                "Digital",
                R.drawable.backtothefutureiii,
                ""
            ),
            Film(
                "Los Cazafantasmas",
                "Ivan Reitman",
                1984,
                "SciFi",
                "Digital",
                R.drawable.ghostbusters,
                ""
            ),
            Film(
                "Dirty Dancing",
                "Emile Ardolino",
                1987,
                "Musical - Romance",
                "Digital",
                R.drawable.dirtydancing,
                ""
            ),
            Film(
                "El resplandor",
                "Stanley Kubrick",
                1980,
                "Terror",
                "Digital",
                R.drawable.elresplandor,
                ""
            ),
            Film(
                "Psicosis",
                "Alfred Hitchcock",
                1960,
                "Terror-Suspense",
                "Digital",
                R.drawable.psycho,
                ""
            ),
            Film(
                "Con faldas y a lo loco",
                "Billy Wilder",
                1963,
                "Comedia",
                "Digital",
                R.drawable.confaldasyaloloco,
                ""
            )
        )
    }
}
