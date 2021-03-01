package org.adnia.jetpack_movie.ui.movie

import androidx.lifecycle.ViewModel
import org.adnia.jetpack_movie.model.DataMovieTvshow
import org.adnia.jetpack_movie.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovie(): List<DataMovieTvshow> = DataDummy.getMovie()
    fun detailMovie(id: Int): DataMovieTvshow? = DataDummy.movieDetail(id)
}