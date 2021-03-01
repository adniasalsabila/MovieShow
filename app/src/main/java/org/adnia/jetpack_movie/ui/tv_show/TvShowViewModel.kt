package org.adnia.jetpack_movie.ui.tv_show

import androidx.lifecycle.ViewModel
import org.adnia.jetpack_movie.model.DataMovieTvshow
import org.adnia.jetpack_movie.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvshow(): List<DataMovieTvshow> = DataDummy.getTvshow()
    fun detailTvShow(id: Int): DataMovieTvshow? = DataDummy.tvShowDetail(id)
}