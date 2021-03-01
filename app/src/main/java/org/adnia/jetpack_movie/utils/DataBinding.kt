package org.adnia.jetpack_movie.utils

import android.widget.ImageView
import org.adnia.jetpack_movie.model.DataMovieTvshow

interface DataBinding {
    fun setBinding(data: DataMovieTvshow)
    fun multipleGlide(firstImage: ImageView, secondImage: ImageView, data: DataMovieTvshow)
}